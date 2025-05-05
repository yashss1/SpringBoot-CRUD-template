package com.crud_050325.Crud.Template.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "books")
public class BookEntity {

    @Id
    private String isbn;

    private String title;

    @ManyToOne(cascade = CascadeType.ALL) //if we get book back, we also retrieve to author
    @JoinColumn(name = "author_id")
    private AuthorEntity authorEntity;
}
