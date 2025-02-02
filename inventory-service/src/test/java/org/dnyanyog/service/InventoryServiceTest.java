package org.dnyanyog.service;

import java.time.LocalDate;
import java.util.Optional;
import org.dnyanyog.InventoryServiceMain;
import org.dnyanyog.common.ResponseCode;
import org.dnyanyog.dto.InventoryRequest;
import org.dnyanyog.dto.InventoryResponse;
import org.dnyanyog.entity.Inventory;
import org.dnyanyog.repositories.InventoryRepo;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.testng.Assert;

@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = InventoryServiceMain.class)
public class InventoryServiceTest {
  @Mock InventoryRepo repo;
  @InjectMocks InventoryServiceImpl inventoryService;
  @Autowired MockMvc mockMvc;

  @Test
  public void addInventory() {
    InventoryRequest request = new InventoryRequest();
    request.setUpdated_at(null);
    request.setBarcode((long) 12234555);
    request.setBrand_name("Sample Brand");
    request.setCategory_name("Sample Brand");
    request.setCost_price(100);
    request.setCreated_at(LocalDate.now());
    request.setDescription("This is a sample product description");
    request.setDimensions(200);
    request.setExpiryDate(LocalDate.now());
    request.setImage_media("image_url.jpg");
    request.setIs_active(false);
    request.setMaximum_stock_level(2);
    request.setMinimum_stock_level(50);
    request.setPrice(45);
    request.setProduct_id(56);
    request.setProduct_name("rtyui");
    request.setQuantity_per_unit(34);
    request.setReduce_qunatity(23);
    request.setSku("ABC123");
    request.setSupplier_name("Sample Supplier");
    request.setTax_rate(18);
    request.setUpdated_at(LocalDate.now());
    request.setWeight(500);
    Inventory inventoryEntity = new Inventory();
    inventoryEntity
        .setBarcode(null)
        .setBrand_name("Sample Brand")
        .setCategory_name("Electronics")
        .setBarcode((long) 123456753)
        .setCost_price(100)
        .setCreated_at(LocalDate.now())
        .setDescription("This is a sample product description")
        .setDimensions(200)
        .setExpiryDate(LocalDate.now())
        .setImage_media("image_url.jpg")
        .setIs_active(false)
        .setMaximum_stock_level(2)
        .setMinimum_stock_level(50)
        .setPrice(100)
        .setProduct_id(23)
        .setProduct_name("Shampoo")
        .setQuantity_per_unit(3)
        .setReduce_quantity(2)
        .setSupplier_name("Sample Supplier")
        .setTax_rate(18)
        .setUpdated_at(LocalDate.now())
        .setWeight(500);
    Mockito.when(repo.save(Mockito.any())).thenReturn(inventoryEntity);
    InventoryResponse response = inventoryService.addOrUpdateInventory(request);
    Assert.assertEquals(ResponseCode.Add_Product.getCode(), response.getCode());
    Assert.assertEquals(ResponseCode.Add_Product.getMessage(), response.getMessage());
    Assert.assertNotNull(response);
  }

  @Test
  public void upadteProduct() {
    InventoryRequest request = new InventoryRequest();
    request.setBarcode((long) 12234523);
    request.setBrand_name("Sample Brand");
    request.setCategory_name("Electronics");
    request.setCost_price(100);
    request.setCreated_at(LocalDate.now());
    request.setDescription("This is a sample product description");
    request.setDimensions(200);
    request.setExpiryDate(LocalDate.now());
    request.setImage_media("image_url.jpg");
    request.setIs_active(false);
    request.setMaximum_stock_level(2);
    request.setMinimum_stock_level(50);
    request.setPrice(100);
    request.setProduct_id(45);
    request.setProduct_name("Shampoo");
    request.setQuantity_per_unit(1);
    request.setReduce_qunatity(23);
    request.setSku("W234");
    request.setSupplier_name("Sample name");
    request.setTax_rate(18);
    request.setUpdated_at(LocalDate.now());
    request.setWeight(500);

    Inventory inventoryEntity = new Inventory();
    inventoryEntity
        .setProduct_id(45)
        .setBarcode((long) 12234523)
        .setBrand_name("Sample Brand")
        .setCategory_name("Electronics")
        .setCost_price(100)
        .setCreated_at(LocalDate.now())
        .setDescription("This is a sample product description")
        .setDimensions(200)
        .setExpiryDate(LocalDate.now())
        .setImage_media("image_url.jpg")
        .setIs_active(false)
        .setMaximum_stock_level(3)
        .setMinimum_stock_level(50)
        .setPrice(100)
        .setProduct_name("Sample name")
        .setQuantity_per_unit(1)
        .setSupplier_name("Sample name")
        .setTax_rate(18)
        .setUpdated_at(LocalDate.now())
        .setWeight(400);

    Mockito.when(repo.findByProductId(45)).thenReturn(Optional.of(inventoryEntity));
    Mockito.when(repo.save(Mockito.any())).thenReturn(inventoryEntity);
    InventoryResponse response = inventoryService.addOrUpdateInventory(request);
    Assert.assertEquals(ResponseCode.Update_Product.getCode(), response.getCode());
    Assert.assertEquals(ResponseCode.Update_Product.getMessage(), response.getMessage());
    Assert.assertNotNull(response);
  }

  @Test
  public void findByproductid() {

    Inventory inventoryEntity = new Inventory();
    inventoryEntity
        .setBarcode((long) 234224556)
        .setBrand_name("Sample")
        .setCategory_name("Electronics")
        .setCreated_at(LocalDate.now())
        .setExpiryDate(LocalDate.now())
        .setDescription("This is a sample product description")
        .setDimensions(200)
        .setImage_media("image_url.jpg")
        .setIs_active(false)
        .setMinimum_stock_level(3)
        .setMaximum_stock_level(50)
        .setPrice(100)
        .setProduct_id(45)
        .setProduct_name("Sample Product")
        .setSupplier_name("Sample Name")
        .setQuantity_per_unit(1)
        .setReduce_quantity(23)
        .setTax_rate(18)
        .setUpdated_at(LocalDate.now())
        .setWeight(500);
    Mockito.when(repo.findByProductId(45)).thenReturn(Optional.of(inventoryEntity));
    InventoryResponse response = inventoryService.findByproduct_id(45);
    Assert.assertEquals(ResponseCode.Search_Product_Success.getMessage(), response.getMessage());
    Assert.assertEquals(ResponseCode.Search_Product_Success.getCode(), response.getCode());
    Assert.assertNotNull(response);
  }

  @Test
  public void deleteById() {
    Inventory existingEntity = new Inventory();
    existingEntity
        .setBarcode((long) 1234564)
        .setBrand_name("Sample")
        .setCategory_name("Electronics")
        .setCost_price(100)
        .setDescription("This is a sample product description")
        .setDimensions(200)
        .setExpiryDate(LocalDate.now())
        .setImage_media("image_url.jpg")
        .setIs_active(false)
        .setMinimum_stock_level(3)
        .setMaximum_stock_level(50)
        .setPrice(100)
        .setProduct_id(34)
        .setProduct_name("Smaple Name ")
        .setSupplier_name("Sample Name ")
        .setQuantity_per_unit(1)
        .setReduce_quantity(23);
    // .setSku("W234");

    Mockito.when(repo.findByProductId(45)).thenReturn(Optional.of(new Inventory()));
    Mockito.when(repo.deleteByProductId(45)).thenReturn(1);
    InventoryResponse response = inventoryService.deleteByproduct_id(45);
    Assert.assertEquals(ResponseCode.Delete_Product.getMessage(), response.getMessage());
    Assert.assertEquals(ResponseCode.Delete_Product.getCode(), response.getCode());
    Mockito.verify(repo).findByProductId(45);
    Mockito.verify(repo).deleteByProductId(45);
  }

  @Test
  public void reduceQuantity() {
    InventoryRequest request = new InventoryRequest();
    request.setBarcode((long) 1234564);
    request.setBrand_name("Sample");
    request.setCategory_name("Electronics");
    request.setCost_price(100);
    request.setDescription("This is a sample product description");
    request.setDimensions(200);
    request.setImage_media("image_url.jpg");
    request.setIs_active(false);
    request.setMaximum_stock_level(50);
    request.setMinimum_stock_level(2);
    request.setPrice(100);
    request.setProduct_id(45);
    request.setProduct_name("Sample Name");
    request.setQuantity_per_unit(1);
    request.setReduce_qunatity(20);
    request.setSku("W123");
    request.setSupplier_name("Sample Name");
    request.setTax_rate(18);
    request.setWeight(500);
    request.setCreated_at(LocalDate.now());
    request.setUpdated_at(LocalDate.now());
    request.setExpiryDate(LocalDate.now());
    Inventory entity = new Inventory();
    entity
        .setBarcode((long) 1234564)
        .setBrand_name("Sample")
        .setCategory_name("Electronics")
        .setCost_price(100)
        .setDescription("This is a sample product description")
        .setDimensions(200)
        .setImage_media("image_url.jpg")
        .setIs_active(false)
        .setMaximum_stock_level(50)
        .setMinimum_stock_level(2)
        .setPrice(100)
        .setProduct_id(45)
        .setProduct_name("Sample Name")
        .setQuantity_per_unit(1)
        .setReduce_quantity(23)
        //  .setSku("W123")
        .setSupplier_name("Sample Name")
        .setTax_rate(18)
        .setWeight(500);

    Mockito.when(repo.findByProductId(45)).thenReturn(Optional.of(entity));

    entity.setReduce_quantity(entity.getReduce_quantity() - request.getReduce_qunatity());

    Mockito.when(repo.save(Mockito.any())).thenReturn(entity);

    InventoryResponse response = inventoryService.reduceQuntity(request);

    Assert.assertEquals(ResponseCode.Reduce_Quantity_Updated.getMessage(), response.getMessage());
    Assert.assertEquals(ResponseCode.Reduce_Quantity_Updated.getCode(), response.getCode());
    Assert.assertNotNull(response);
  }
}
