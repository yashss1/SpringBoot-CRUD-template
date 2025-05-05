package com.crud_050325.Crud.Template.repositories;

import com.crud_050325.Crud.Template.domain.entities.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository  extends CrudRepository<BookEntity, String> {
}
