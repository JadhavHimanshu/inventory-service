package org.dnyanyog.common;

public enum ResponseCode {
  Add_Product("200", "Product added sucessfully "),
  Update_Product("200", "Product updated sucessfully"),
  Search_Product_Success("200", "Product found sucessfully"),
  Delete_Product("200", "Product deleted sucessfully"),
  Search_Product_Fail("911", "Product not found "),
  Reduce_Quantity_Updated("200", "Product Quantiy upddated sucessfully"),
  Insuffiecient_Quantity("200", " Product  are Insuffienct ");

  private final String code;
  private final String message;

  private ResponseCode(String code, String message) {
    this.code = code;
    this.message = message;
  }

  public String getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }
}
