package com.ismail.ecommerce.dto;

public record ProductResponseDto(
        Long id,
        String name,
        String description,
        Double price,
        Integer quantity
) {
}
