package com.practice.commerce.mapper;

import com.practice.commerce.common.GenericMapper;
import com.practice.commerce.domain.Item;
import com.practice.commerce.dto.ItemRequestDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper extends GenericMapper<ItemRequestDto, Item> {

}
