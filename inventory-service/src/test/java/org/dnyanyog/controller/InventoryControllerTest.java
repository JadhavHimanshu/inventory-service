package org.dnyanyog.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.dnyanyog.common.ResponseCode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class InventoryControllerTest {
  @Autowired private MockMvc mockMvc;

  @Test
  public void addInventory() throws Exception {
    RequestBuilder requestBuilder =
        MockMvcRequestBuilders.post("/api/v1/product")
            .content(
                "{\r\n"
                    + "  \"product_id\": 34,\r\n"
                    + "  \"product_name\":  \"Shampoo\",\r\n"
                    + "  \"sku\": \"ABC123\",\r\n"
                    + "  \"description\": \"This is a sample product description.\",\r\n"
                    + "  \"category_name\": \"Electronics\",\r\n"
                    + "  \"brand_name\": \"Sample Brand\",\r\n"
                    + "  \"price\": 100,\r\n"
                    + "  \"cost_price\": 80,\r\n"
                    + "  \"tax_rate\": 18,\r\n"
                    + "  \"quantity_per_unit\": 10,\r\n"
                    + "  \"barcode\": 1234567890123,\r\n"
                    + "  \"weight\": 500,\r\n"
                    + "  \"dimensions\": 200,\r\n"
                    + "  \"image_media\": \"image_url.jpg\",\r\n"
                    + "  \"supplier_name\": \"Sample Supplier\",\r\n"
                    + "  \"minimum_stock_level\":\"2\",\r\n"
                    + "  \"maximum_stock_level\": \"50\",\r\n"
                    + "  \"is_active\":\"true\",\r\n"
                    + "  \"created_at\":\"2025-5-3\" ,\r\n"
                    + "   \"updated_at\":\"2025-9-5\",\r\n"
                    + "    \"expiryDate\": \"2027-7-3\",\r\n"
                    + "  \"reduce_qunatity\":\"30\"\r\n"
                    + "}\r\n"
                    + "")
            .contentType(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON);

    mockMvc
        .perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.code").value(ResponseCode.Add_Product.getCode()))
        .andExpect(jsonPath("$.message").value(ResponseCode.Add_Product.getMessage()))
        .andReturn();
  }

  @Test
  public void updateInventory() throws Exception {
    RequestBuilder requestBuilder =
        MockMvcRequestBuilders.post("/api/v1/product")
            .content(
                "{\r\n"
                    + "  \"product_id\": 153,\r\n"
                    + "  \"product_name\":  \"Shampoo\",\r\n"
                    + "  \"sku\": \"ABC123\",\r\n"
                    + "  \"description\": \"This is a sample product description.\",\r\n"
                    + "  \"category_name\": \"Electronics\",\r\n"
                    + "  \"brand_name\": \"Sample Brand\",\r\n"
                    + "  \"price\": 100,\r\n"
                    + "  \"cost_price\": 80,\r\n"
                    + "  \"tax_rate\": 18,\r\n"
                    + "  \"quantity_per_unit\": 10,\r\n"
                    + "  \"barcode\": 1234567890123,\r\n"
                    + "  \"weight\": 500,\r\n"
                    + "  \"dimensions\": 200,\r\n"
                    + "  \"image_media\": \"image_url.jpg\",\r\n"
                    + "  \"supplier_name\": \"Sample Supplier\",\r\n"
                    + "  \"minimum_stock_level\":\"2\",\r\n"
                    + "  \"maximum_stock_level\": \"50\",\r\n"
                    + "  \"is_active\":\"true\",\r\n"
                    + "  \"created_at\":\"2025-2-3\" ,\r\n"
                    + "   \"updated_at\":\"2025-3-4\",\r\n"
                    + "    \"expiryDate\": \"2027-3-2\",\r\n"
                    + "  \"reduce_qunatity\":\"30\"\r\n"
                    + "}\r\n"
                    + "")
            .contentType(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON);
    mockMvc
        .perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.code").value(ResponseCode.Update_Product.getCode()))
        .andExpect(jsonPath("$.message").value(ResponseCode.Update_Product.getMessage()))
        .andReturn();
  }

  @Test
  public void findByproductId() throws Exception {
    RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/v1/product/productId/402");
    //   .accept(MediaType.APPLICATION_JSON);
    mockMvc
        .perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.code").value(ResponseCode.Search_Product_Success.getCode()))
        .andExpect(jsonPath("$.message").value(ResponseCode.Search_Product_Success.getMessage()))
        .andReturn();
  }

  @Test
  public void deletebyproductId() throws Exception {
    RequestBuilder requestBuilder =
        MockMvcRequestBuilders.delete("/api/v1/delete/productId/153")
            .accept(MediaType.APPLICATION_JSON);
    mockMvc
        .perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.code").value(ResponseCode.Delete_Product.getCode()))
        .andExpect(jsonPath("$.message").value(ResponseCode.Delete_Product.getMessage()))
        .andReturn();
  }

  @Test
  public void reduceQuantity() throws Exception {
    RequestBuilder requestBuilder =
        MockMvcRequestBuilders.post("/api/v1/product/reduceQuantity")
            .content(
                "{ \"product_id\": 153,\r\n"
                    + "  \"product_name\": \"electronics\",\r\n"
                    + "  \"sku\": \"string\",\r\n"
                    + "  \"description\": \"string\",\r\n"
                    + "  \"category_name\": \"string\",\r\n"
                    + "  \"brand_name\": \"Sample name \",\r\n"
                    + "  \"price\": 130,\r\n"
                    + "  \"cost_price\": 100,\r\n"
                    + "  \"tax_rate\": 18,\r\n"
                    + "  \"quantity_per_unit\": 6,\r\n"
                    + "  \"barcode\": 34567890,\r\n"
                    + "  \"weight\": 18,\r\n"
                    + "  \"dimensions\": 300,\r\n"
                    + "  \"image_media\": \"Img.url\",\r\n"
                    + "  \"supplier_name\": \"sample Name \",\r\n"
                    + "  \"minimum_stock_level\": 100 ,\r\n"
                    + "  \"maximum_stock_level\": 5 ,\r\n"
                    + " \"reduce_qunatity\":50 }\r\n"
                    + "  ")
            .contentType(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON);
    mockMvc
        .perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.code").value(ResponseCode.Reduce_Quantity_Updated.getCode()))
        .andExpect(jsonPath("$.message").value(ResponseCode.Reduce_Quantity_Updated.getMessage()))
        .andReturn();
  }
}
