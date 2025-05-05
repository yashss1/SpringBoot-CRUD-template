package com.crud_050325.Crud.Template.services.impl;

import com.crud_050325.Crud.Template.domain.entities.AuthorEntity;
import com.crud_050325.Crud.Template.repositories.AuthorRepository;
import com.crud_050325.Crud.Template.services.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorEntity createAuthor(AuthorEntity authorEntity) {
        return authorRepository.save(authorEntity);
    }
}
