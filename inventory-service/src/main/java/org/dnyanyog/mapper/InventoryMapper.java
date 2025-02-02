package org.dnyanyog.mapper;

import org.dnyanyog.dto.InventoryRequest;
import org.dnyanyog.dto.InventoryResponse;
import org.dnyanyog.entity.Inventory;

public class InventoryMapper {
  public static Inventory toEntity(InventoryRequest request) {
    return Inventory.getInstance()
        .setProduct_id(request.getProduct_id())
        .setBarcode(request.getBarcode())
        .setBrand_name(request.getBrand_name())
        .setCategory_name(request.getCategory_name())
        .setCreated_at(request.getCreated_at())
        .setDescription(request.getDescription())
        .setDimensions(request.getDimensions())
        .setIs_active(false)
        .setMaximum_stock_level(request.getMaximum_stock_level())
        .setMinimum_stock_level(request.getMinimum_stock_level())
        .setPrice(request.getPrice())
        .setSupplier_name(request.getSupplier_name())
        .setTax_rate(request.getTax_rate())
        .setWeight(request.getWeight())
        .setCost_price(request.getCost_price())
        .setProduct_name(request.getProduct_name())
        .setQuantity_per_unit(request.getQuantity_per_unit())
        //  .setUpdated_at(request.)
        .setUpdated_at(request.getUpdated_at())
        .setExpiryDate(request.getExpiryDate())
        .setReduce_quantity(request.getReduce_qunatity())
        .setImage_media(request.getImage_media());
  }

  public static InventoryResponse toDto(Inventory inverntory, String code, String message) {
    InventoryResponse response = new InventoryResponse();
    response.setProduct_name(inverntory.getProduct_name());
    response.setCode(code);
    response.setMessage(message);
    response.setProduct_id(inverntory.getProduct_id());
    response.setCreated_at(inverntory.getCreated_at());
    response.setBarcode(inverntory.getBarcode());
    response.setBrand_name(inverntory.getBrand_name());
    response.setCategory_name(inverntory.getCategory_name());
    response.setCost_price(inverntory.getCost_price());
    response.setDescription(inverntory.getDescription());
    response.setDimensions(inverntory.getDimensions());
    response.setImage_media(inverntory.getImage_media());
    response.setMaximum_stock_level(inverntory.getMaximum_stock_level());
    response.setMinimum_stock_level(inverntory.getMinimum_stock_level());
    response.setPrice(inverntory.getPrice());
    response.setQuantity_per_unit(inverntory.getQuantity_per_unit());
    response.setExpiryDate(inverntory.getExpiryDate());
    response.setUpdated_at(inverntory.getUpdated_at());
    response.setReduce_qunatity(inverntory.getReduce_quantity());
    response.setIs_active(false);
    return response;
  }
}
