package org.dnyanyog.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import java.time.LocalDate;
import org.springframework.stereotype.Component;

@Component
public class InventoryData {
  @NotBlank(message = "Product name cannot be blank ")
  private String product_name;

  private Integer product_id;

  @NotBlank(message = "SKU cannot be blank")
  private String sku;

  @NotBlank(message = "Description cannot be blank")
  private String description;

  @NotBlank(message = "Category cannot be blank")
  private String category_name;

  @NotBlank(message = "Brand name cannot be blank")
  private String brand_name;

  @NotNull(message = "Price cannot be null")
  private Integer price;

  @NotNull(message = "Cost Price cannot be null")
  @PositiveOrZero(message = "Cost Price must be 0 or greater")
  private Integer cost_price;

  @NotNull(message = "Tax rate cannot be null")
  @Min(value = 0, message = "Tax rate must be 0 or greater")
  @Max(value = 100, message = "Tax rate cannot greater than 100")
  private Integer tax_rate;

  @NotNull(message = "quantity per unit cannot be null")
  @Positive(message = "Qunatity per unit must be greater than 0")
  private Integer quantity_per_unit;

  @NotNull(message = "Barcode cannot be null")
  @Positive(message = "Barcode must be postive number")
  private Long barcode;

  @NotNull(message = "Weihght cannot be null")
  @Positive(message = "weight  must be greater than 0")
  private Integer weight;

  @NotNull(message = "Dimension cannot be null")
  @Positive(message = "Dimension must be greater than 0")
  private Integer dimensions;

  @NotBlank(message = "Image path required ")
  private String image_media;

  @NotBlank(message = "supplier name cannot be blank")
  private String supplier_name;

  @NotNull(message = "")
  @Min(value = 0, message = "")
  private Integer minimum_stock_level;

  @NotNull(message = "")
  @Positive(message = "Maximum stock level must be a positive integer")
  private Integer maximum_stock_level;

  private boolean is_active;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-M-d")
  private LocalDate created_at;

  @JsonDeserialize
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-M-d")
  private LocalDate updated_at;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-M-d")
  private LocalDate expiryDate;

  private Integer reduce_qunatity;

  public String getProduct_name() {
    return product_name;
  }

  public void setProduct_name(String product_name) {
    this.product_name = product_name;
  }

  public Integer getProduct_id() {
    return product_id;
  }

  public void setProduct_id(Integer product_id) {
    this.product_id = product_id;
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
