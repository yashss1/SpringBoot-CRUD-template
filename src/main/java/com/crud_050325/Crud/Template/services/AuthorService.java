package com.crud_050325.Crud.Template.services;

import com.crud_050325.Crud.Template.domain.entities.AuthorEntity;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    AuthorEntity createAuthor(AuthorEntity authorEntity);

    public List<AuthorEntity> findAll();

    public Optional<AuthorEntity> findOne(Long id);
}
