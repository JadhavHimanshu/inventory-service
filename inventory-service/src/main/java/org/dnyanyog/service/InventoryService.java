package org.dnyanyog.service;

import java.util.List;
import org.dnyanyog.dto.InventoryRequest;
import org.dnyanyog.dto.InventoryResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Configuration
@Service
public interface InventoryService {

  InventoryResponse addOrUpdateInventory(InventoryRequest request);

  InventoryResponse findByproduct_id(Integer productId);

  List<InventoryResponse> getAllProducts(InventoryRequest request);

  InventoryResponse deleteByproduct_id(Integer productId);
}
