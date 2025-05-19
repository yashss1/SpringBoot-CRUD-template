package com.crud_050325.Crud.Template.services;

import com.crud_050325.Crud.Template.domain.entities.AuthorEntity;
import com.crud_050325.Crud.Template.domain.entities.BookEntity;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

public interface BookService {

    BookEntity createBook(String isbn, BookEntity book);

    public List<BookEntity> findAll();

    public Optional<BookEntity> findOne(String isbn);
}
