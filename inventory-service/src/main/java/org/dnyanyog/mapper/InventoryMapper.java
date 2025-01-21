package org.dnyanyog.mapper;

import org.dnyanyog.dto.InventoryResponse;
import org.dnyanyog.entity.Inventory;

public class InventoryMapper {
  //  public static Inventory toEntity(InventoryRequest request, Integer product_id) {
  //    return Inventory.getInstance()
  //    		   .setProduct_id(request.getProduct_id())
  //   .se
  //				  .setPrice(request.getPrice())
  //				  .setsetBarcode(request.getBarcode())
  //				  .
  //				  //.setSku(request.getSku())
  //

  // }

  public static InventoryResponse toDto(Inventory inverntory, String message, String code) {
    InventoryResponse response = new InventoryResponse();
    // response.setProduct_name(inverntory.setprr);
    response.setCode(code);
    response.setMessage(message);
    response.setProduct_id(inverntory.getProduct_id());
    response.setExpiryDate(inverntory.getDate());
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
    response.setIs_active(false);
    return response;
  }
}
