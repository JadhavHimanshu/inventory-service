package org.dnyanyog.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import java.util.List;
import org.dnyanyog.dto.InventoryRequest;
import org.dnyanyog.dto.InventoryResponse;
import org.dnyanyog.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping("/api/v1/auth")
@Component
public class InventoryControlller {
  @Autowired private InventoryService inventoryService;

  @PostMapping(
      path = "/api/v1/auth/product",
      consumes = {"application/json", "application/xml"},
      produces = {"application/json", "application/xml"})
  public InventoryResponse addOrUpdateInventory(@Valid @RequestBody InventoryRequest request) {
    if (request.getProduct_id() == null || request.getProduct_id() <= 0) {
      return inventoryService.addOrUpdateInventory(request);
    } else {
      return inventoryService.addOrUpdateInventory(request);
    }
  }

  @GetMapping(
      path = "/api/v1/auth/product/productId/{productId}",
      consumes = {"application/json", "application/xml"},
      produces = {"application/json", "application/xml"})
  public ResponseEntity<InventoryResponse> findByproduct_id(
      @Valid @PathVariable Integer productId) {
    InventoryResponse response = inventoryService.findByproduct_id(productId);
    return ResponseEntity.ok(response);
  }

  @GetMapping(
      path = "/api/v1/auth/products",
      consumes = {"application/json", "application/xml"},
      produces = {"application/json", "application/xml"})
  public ResponseEntity<List<InventoryResponse>> getAllProducts(
      @RequestBody InventoryRequest request) {
    List<InventoryResponse> inventory = inventoryService.getAllProducts(request);
    return ResponseEntity.ok(inventory);
  }

  @Transactional
  @DeleteMapping(path = "/api/v1/auth/delete/productId/{productId}")
  public InventoryResponse deleteProduct(@Valid @PathVariable Integer productId) {
    return inventoryService.deleteByproduct_id(productId);
  }
}
