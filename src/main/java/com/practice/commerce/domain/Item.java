package com.practice.commerce.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

/**
 * TODO : 1. 제품 이미지 업로드
 */

@Entity
@Table(schema = "commerce_db")
@Getter
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Comment("상품명")
    private String name;

    @Column
    @Comment("제품 설명")
    private String detail;

    @Column
    @Comment("상품 가격")
    private Integer price;

    @Enumerated(EnumType.STRING)
    private ItemType itemType;

    @Column
    @Comment("재품 수량")
    private int stockQuantity;


    @Builder
    public Item(String name, String detail, Integer price,
            ItemType itemType, int stockQuantity) {
        this.name = name;
        this.detail = detail;
        this.price = price;
        this.itemType = itemType;
        this.stockQuantity = stockQuantity;
    }


    public static Item ofcreate(String name, String detail, Integer price,
            ItemType itemType, int stockQuantity) {
        return Item.builder()
                .name(name)
                .detail(detail)
                .price(price)
                .itemType(itemType)
                .stockQuantity(stockQuantity)
                .build();
    }
}
