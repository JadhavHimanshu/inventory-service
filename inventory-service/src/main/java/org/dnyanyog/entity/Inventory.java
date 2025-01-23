package org.dnyanyog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import org.springframework.stereotype.Component;

@Entity
@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "inventory_service")
public class Inventory {

  @Column(name = "product_id")
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer productId;

  @Column(name = "product_name")
  private String product_name;

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

  @Column(name = "quantity")
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

  @Column(name = "is_active")
  private boolean is_active;

  @Column(name = "date")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
  // @JsonDeserialize
  private Date created_at;

  public Integer getProduct_id() {
    return productId;
  }

  public Inventory setProduct_id(Integer product_id) {
    this.productId = product_id;
    return this;
  }

  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public Date getCreated_at() {
    return created_at;
  }

  public Inventory setCreated_at(Date created_at) {
    this.created_at = created_at;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public Inventory setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getCategory_name() {
    return category_name;
  }

  public Inventory setCategory_name(String category_name) {
    this.category_name = category_name;
    return this;
  }

  public String getBrand_name() {
    return brand_name;
  }

  public Inventory setBrand_name(String brand_name) {
    this.brand_name = brand_name;
    return this;
  }

  public Integer getPrice() {
    return price;
  }

  public Inventory setPrice(Integer price) {
    this.price = price;
    return this;
  }

  public Integer getCost_price() {
    return cost_price;
  }

  public Inventory setCost_price(Integer cost_price) {
    this.cost_price = cost_price;
    return this;
  }

  public Integer getTax_rate() {
    return tax_rate;
  }

  public Inventory setTax_rate(Integer tax_rate) {
    this.tax_rate = tax_rate;
    return this;
  }

  public Integer getQuantity_per_unit() {
    return quantity_per_unit;
  }

  public Inventory setQuantity_per_unit(Integer quantity_per_unit) {
    this.quantity_per_unit = quantity_per_unit;
    return this;
  }

  public Long getBarcode() {
    return barcode;
  }

  public Inventory setBarcode(Long barcode) {
    this.barcode = barcode;
    return this;
  }

  public Integer getWeight() {
    return weight;
  }

  public Inventory setWeight(Integer weight) {
    this.weight = weight;
    return this;
  }

  public Integer getDimensions() {
    return dimensions;
  }

  public Inventory setDimensions(Integer dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  public String getImage_media() {
    return image_media;
  }

  public Inventory setImage_media(String image_media) {
    this.image_media = image_media;
    return this;
  }

  public String getSupplier_name() {
    return supplier_name;
  }

  public Inventory setSupplier_name(String supplier_name) {
    this.supplier_name = supplier_name;
    return this;
  }

  public Integer getMinimum_stock_level() {
    return minimum_stock_level;
  }

  public Inventory setMinimum_stock_level(Integer minimum_stock_level) {
    this.minimum_stock_level = minimum_stock_level;
    return this;
  }

  public Integer getMaximum_stock_level() {
    return maximum_stock_level;
  }

  public Inventory setMaximum_stock_level(Integer maximum_stock_level) {
    this.maximum_stock_level = maximum_stock_level;
    return this;
  }

  public boolean isIs_active() {
    return is_active;
  }

  public Inventory setIs_active(boolean is_active) {
    this.is_active = is_active;
    return this;
  }

  public String getProduct_name() {
    return product_name;
  }

  public Inventory setProduct_name(String product_name) {
    this.product_name = product_name;
    return this;
  }

  public static Inventory getInstance() {
    return new Inventory();
  }
}
