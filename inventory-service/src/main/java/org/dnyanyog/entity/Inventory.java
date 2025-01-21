package org.dnyanyog.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Date;
import org.springframework.stereotype.Component;

@Entity
@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "inventory_service")
public class Inventory {
  @Column(name = "product_id")
  private Integer product_id;

  @Column(name = "description")
  private String description;

  @Column(name = "category_name")
  private String category_name;

  @Column(name = "brand_name")
  private String brand_name;

  @Column(name = "price")
  private Integer price;

  @Column(name = "cost_price")
  private Integer cost_price;

  @Column(name = "tax_rate")
  private Integer tax_rate;

  @Column(name = "quantiy")
  private Integer quantity_per_unit;

  @Column(name = "barcode")
  private Long barcode;

  @Column(name = "weight")
  private Integer weight;

  @Column(name = "dimension")
  private Integer dimensions;

  @Column(name = "img_media")
  private String image_media;

  @Column(name = "sup_name")
  private String supplier_name;

  @Column(name = "min_stock")
  private Integer minimum_stock_level;

  @Column(name = "max_stock")
  private Integer maximum_stock_level;

  @Column(name = "")
  private boolean is_active;

  @Column(name = "date")
  private Date date;

  public Integer getProduct_id() {
    return product_id;
  }

  public void setProduct_id(Integer product_id) {
    this.product_id = product_id;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
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

  public static Inventory getInstance() {
    return new Inventory();
  }
}
