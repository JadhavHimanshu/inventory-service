package org.dnyanyog.service;

import jakarta.validation.Valid;
import java.util.List;
import org.dnyanyog.dto.InventoryRequest;
import org.dnyanyog.dto.InventoryResponse;

public class InventoryServiceImpl implements InventoryService {

  @Override
  public InventoryResponse addOrUpdateInventory(@Valid InventoryRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public InventoryResponse findByproduct_id(@Valid Integer productId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<InventoryResponse> getAllProducts(InventoryRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public InventoryResponse deleteByproduct_id(@Valid Integer productId) {
    // TODO Auto-generated method stub
    return null;
  }
}
