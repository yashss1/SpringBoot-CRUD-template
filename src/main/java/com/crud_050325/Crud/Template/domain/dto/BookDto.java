package com.crud_050325.Crud.Template.domain.dto;

import com.crud_050325.Crud.Template.domain.entities.AuthorEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto {
    private String isbn;

    private String title;

    private AuthorDto author;
}
