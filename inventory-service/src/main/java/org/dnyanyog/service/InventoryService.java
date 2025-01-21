package org.dnyanyog.service;

import jakarta.validation.Valid;
import java.util.List;
import org.dnyanyog.dto.InventoryRequest;
import org.dnyanyog.dto.InventoryResponse;

public interface InventoryService {

  InventoryResponse addOrUpdateInventory(@Valid InventoryRequest request);

  InventoryResponse findByproduct_id(@Valid Integer productId);

  List<InventoryResponse> getAllProducts(InventoryRequest request);

  InventoryResponse deleteByproduct_id(@Valid Integer productId);
}
