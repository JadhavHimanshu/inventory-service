package org.dnyanyog.service;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.dnyanyog.common.ResponseCode;
import org.dnyanyog.dto.InventoryRequest;
import org.dnyanyog.dto.InventoryResponse;
import org.dnyanyog.entity.Inventory;
import org.dnyanyog.mapper.InventoryMapper;
import org.dnyanyog.repositories.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
@Configuration
public class InventoryServiceImpl implements InventoryService {
  @Autowired InventoryRepo repo;

  @Override
  public InventoryResponse addOrUpdateInventory(@Valid InventoryRequest request) {
    InventoryResponse response = new InventoryResponse();
    Optional<Inventory> inventoryData = this.repo.findByProductId(request.getProduct_id());
    if (inventoryData.isPresent()) {
      Inventory updateInventory = InventoryMapper.toEntity(request);
      Inventory saveInventory = repo.save(updateInventory);
      response =
          InventoryMapper.toDto(
              saveInventory,
              ResponseCode.Update_Product.getCode(),
              ResponseCode.Update_Product.getMessage());
    } else {
      Inventory newInventory = InventoryMapper.toEntity(request);
      Inventory saveInventory = repo.save(newInventory);
      response =
          InventoryMapper.toDto(
              saveInventory,
              ResponseCode.Add_Product.getMessage(),
              ResponseCode.Add_Product.getCode());
    }
    return response;
  }

  @Override
  public InventoryResponse findByproduct_id(@Valid Integer productId) {
    Optional<Inventory> inventoryData = this.repo.findByProductId(productId);
    if (inventoryData.isPresent()) {
      return InventoryMapper.toDto(
          inventoryData.get(),
          ResponseCode.Search_Product_Success.getMessage(),
          ResponseCode.Search_Product_Success.getCode());

    } else {
      InventoryResponse response = new InventoryResponse();
      response.setMessage(ResponseCode.Search_Product_Fail.getMessage());
      response.setCode(ResponseCode.Search_Product_Fail.getCode());
      return response;
    }
  }

  @Override
  public List<InventoryResponse> getAllProducts(InventoryRequest request) {
    List<Inventory> inventoryData = repo.findAll();
    List<InventoryResponse> response =
        inventoryData.stream()
            .map(
                inventoryEntity ->
                    InventoryMapper.toDto(
                        inventoryEntity,
                        ResponseCode.Search_Product_Success.getMessage(),
                        ResponseCode.Search_Product_Success.getCode()))
            .collect(Collectors.toList());
    return response;
  }

  @Override
  public InventoryResponse deleteByproduct_id(@Valid Integer productId) {
    InventoryResponse response = new InventoryResponse();
    Optional<Inventory> inventoryData = this.repo.findByProductId(productId);
    if (inventoryData.isPresent()) {
      int rowDeleted = repo.deleteByProductId(productId);
      if (rowDeleted > 0) {
        response.setMessage(ResponseCode.Delete_Product.getMessage());
        response.setCode(ResponseCode.Delete_Product.getCode());
      }
    }
    return response;
  }

  @Override
  public InventoryResponse reduceQuntity(InventoryRequest request) {
    InventoryResponse response = new InventoryResponse();
    Optional<Inventory> data = this.repo.findByProductId(request.getProduct_id());
    if (data.isPresent()) {
      Inventory inventory = data.get();
      if (inventory.getMaximum_stock_level() >= request.getReduce_qunatity()) {
        inventory.setMaximum_stock_level(
            inventory.getMaximum_stock_level() - request.getReduce_qunatity());
        response =
            InventoryMapper.toDto(
                inventory,
                ResponseCode.Reduce_Quantity_Updated.getMessage(),
                ResponseCode.Reduce_Quantity_Updated.getCode());
      } else {
        response.setCode(ResponseCode.Insuffiecient_Quantity.getCode());
        response.setMessage(ResponseCode.Insuffiecient_Quantity.getMessage());
      }
    } else {
      response.setMessage(ResponseCode.Search_Product_Fail.getMessage());
      response.setCode(ResponseCode.Search_Product_Fail.getCode());
    }
    return response;
  }
}
