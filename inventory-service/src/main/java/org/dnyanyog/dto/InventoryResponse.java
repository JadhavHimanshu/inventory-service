package org.dnyanyog.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.LocalDate;
import org.springframework.stereotype.Component;

@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InventoryResponse {
  private String code;
  private String message;
  private Integer product_id;
  private String product_name;
  private String sku;
  private String description;
  private String category_name;
  private String brand_name;
  private Integer price;
  private Integer cost_price;
  private Integer tax_rate;
  private Integer quantity_per_unit;
  private Long barcode;
  private Integer weight;
  private Integer dimensions;
  private String image_media;
  private String supplier_name;
  private Integer minimum_stock_level;
  private Integer maximum_stock_level;
  private boolean is_active;

  private LocalDate created_at;
  private LocalDate updated_at;
  private LocalDate expiryDate;

  private Integer reduce_qunatity;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getProduct_name() {
    return product_name;
  }

  public void setProduct_name(String product_name) {
    this.product_name = product_name;
  }

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCategory_name() {
    return category_name;
  }

  public void setCategory_name(String category_name) {
    this.category_name = category_name;
  }

  public String getBrand_name() {
    return brand_name;
  }

  public void setBrand_name(String brand_name) {
    this.brand_name = brand_name;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Integer getCost_price() {
    return cost_price;
  }

  public void setCost_price(Integer cost_price) {
    this.cost_price = cost_price;
  }

  public Integer getTax_rate() {
    return tax_rate;
  }

  public void setTax_rate(Integer tax_rate) {
    this.tax_rate = tax_rate;
  }

  public Integer getQuantity_per_unit() {
    return quantity_per_unit;
  }

  public void setQuantity_per_unit(Integer quantity_per_unit) {
    this.quantity_per_unit = quantity_per_unit;
  }

  public Long getBarcode() {
    return barcode;
  }

  public void setBarcode(Long barcode) {
    this.barcode = barcode;
  }

  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public Integer getDimensions() {
    return dimensions;
  }

  public void setDimensions(Integer dimensions) {
    this.dimensions = dimensions;
  }

  public String getImage_media() {
    return image_media;
  }

  public void setImage_media(String image_media) {
    this.image_media = image_media;
  }

  public String getSupplier_name() {
    return supplier_name;
  }

  public void setSupplier_name(String supplier_name) {
    this.supplier_name = supplier_name;
  }

  public Integer getMinimum_stock_level() {
    return minimum_stock_level;
  }

  public void setMinimum_stock_level(Integer minimum_stock_level) {
    this.minimum_stock_level = minimum_stock_level;
  }

  public Integer getMaximum_stock_level() {
    return maximum_stock_level;
  }

  public void setMaximum_stock_level(Integer maximum_stock_level) {
    this.maximum_stock_level = maximum_stock_level;
  }

  public boolean isIs_active() {
    return is_active;
  }

  public void setIs_active(boolean is_active) {
    this.is_active = is_active;
  }

  public LocalDate getCreated_at() {
    return created_at;
  }

  public void setCreated_at(LocalDate created_at) {
    this.created_at = created_at;
  }

  public Integer getProduct_id() {
    return product_id;
  }

  public void setProduct_id(Integer product_id) {
    this.product_id = product_id;
  }

  public LocalDate getUpdated_at() {
    return updated_at;
  }

  public void setUpdated_at(LocalDate updated_at) {
    this.updated_at = updated_at;
  }

  public LocalDate getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
  }

  public Integer getReduce_qunatity() {
    return reduce_qunatity;
  }

  public void setReduce_qunatity(Integer reduce_qunatity) {
    this.reduce_qunatity = reduce_qunatity;
  }
}
