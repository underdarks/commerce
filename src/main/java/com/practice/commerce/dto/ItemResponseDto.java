package com.practice.commerce.dto;

import com.practice.commerce.domain.ItemType;
import lombok.Getter;


@Getter
public abstract class ItemResponseDto {

    private String name;
    private String detail;
    private Integer price;
    private ItemType itemType;
    private int stockQuantity;

}
