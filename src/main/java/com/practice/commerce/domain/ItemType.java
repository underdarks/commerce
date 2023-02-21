package com.practice.commerce.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ItemType {
    FOOD("음식")
    , CLOTHES("의류")

    ;



    private String label;

}