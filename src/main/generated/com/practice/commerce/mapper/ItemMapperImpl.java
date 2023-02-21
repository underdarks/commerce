package com.practice.commerce.mapper;

import com.practice.commerce.domain.Item;
import com.practice.commerce.dto.ItemRequestDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-18T16:39:34+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
@Component
public class ItemMapperImpl implements ItemMapper {

    @Override
    public ItemRequestDto toDto(Item e) {
        if ( e == null ) {
            return null;
        }

        ItemRequestDto itemRequestDto = new ItemRequestDto();

        return itemRequestDto;
    }

    @Override
    public Item toEntity(ItemRequestDto d) {
        if ( d == null ) {
            return null;
        }

        Item.ItemBuilder item = Item.builder();

        return item.build();
    }

    @Override
    public void updateFromDto(ItemRequestDto dto, Item entity) {
        if ( dto == null ) {
            return;
        }
    }
}
