package com.practice.commerce.repository;


import static org.assertj.core.api.Assertions.*;

import com.practice.commerce.domain.Item;
import com.practice.commerce.domain.ItemType;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;


    @DisplayName("아이템 엔티티 저장 테스트")
    @Test
    public void saveItem() {
        //given
        Item item = Item.ofcreate("상품 A", "이것은 상품 A입니다.", 10_000, ItemType.FOOD, 100);

        //when
        Item saveEntity = itemRepository.save(item);

        //then
        assertThat(saveEntity).isEqualTo(item);
    }


}