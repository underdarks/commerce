package com.practice.commerce.common;

import org.mapstruct.MappingTarget;

public interface GenericMapper<D,E> {
    D toDto(E e);
    E toEntity(D d);

    /**
     * 기존 생성되어 있는 Entity를 업데이트하고 싶을 떄 null이 아닌 값만 업데이트
     * @MappingTarget : 업데이트 할 target 설정
     */
    void updateFromDto(D dto,@MappingTarget E entity);

}
