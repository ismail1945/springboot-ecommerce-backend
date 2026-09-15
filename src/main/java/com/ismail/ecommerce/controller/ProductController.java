package com.ismail.ecommerce.controller;

import com.ismail.ecommerce.dto.ProductRequestDto;
import com.ismail.ecommerce.dto.ProductResponseDto;
import com.ismail.ecommerce.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ProductResponseDto addProduct(@Valid @RequestBody ProductRequestDto product) {
        return productService.addProduct(product);
    }

    @GetMapping
    public List<ProductResponseDto> getProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ProductResponseDto getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }
}