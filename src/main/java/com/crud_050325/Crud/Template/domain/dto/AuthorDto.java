package com.crud_050325.Crud.Template.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
1. We dont want to use Author in presentation layer, it is an entity which
    exists in presistance layer or max service layer
2. So creating DTO (data transfer object)
3. So service layer will return Entity, but it will be mapped to dto object here, which
    will be then used by presentation layer
4.

*/

@Data
@AllArgsConstructor
@NoArgsConstructor // for jackson
@Builder
public class AuthorDto {
    private Long id;

    private String name;

    private Integer age;
}
