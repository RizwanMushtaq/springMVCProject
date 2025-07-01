package com.rizwanmushtaq.controllers.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class productController {
  /**
   * This method is used to fetch product details.
   * It accepts two parameters: productId and productName.
   * If productId is not provided, it defaults to 0.
   * The productName is required.
   * <p>
   * This concept is known as "Request Parameter" in Spring MVC and Query
   * Parameters in RESTful APIs.
   *
   * @param id   the ID of the product (default is 0)
   * @param name the name of the product (required)
   * @return a string message with product details
   */
  @GetMapping("/getProduct")
  public String getProduct(@RequestParam(
                               value = "productId",
                               defaultValue = "0",
                               required = false
                           ) int id,
                           @RequestParam(
                               value = "productName",
                               required = true
                           ) String name) {
    System.out.println("Fetching products from API" + id + name);
    return "Products fetched successfully" +
        " Product ID: " + id +
        " Product Name: " + name;
  }

  /**
   * This method is used to check product availability.
   * It accepts two path variables: productId and productName.
   * Both parameters are required.
   * <p>
   * This concept is known as "Path Variable" in Spring MVC and RESTful APIs.
   *
   * @param id          the ID of the product (required)
   * @param productName the name of the product (required)
   * @return a string message indicating product availability
   */
  @RequestMapping("/checkProduct/{productId}/{productName}")
  public String checkProduct(@PathVariable(
                                 value = "productId",
                                 required = true
                             ) int id,
                             @PathVariable String productName) {
    System.out.println("Checking product availability for ID: " + id +
        " and Name: " + productName);
    return "Product is available" +
        " Product ID: " + id +
        " Product Name: " + productName;
  }
}
