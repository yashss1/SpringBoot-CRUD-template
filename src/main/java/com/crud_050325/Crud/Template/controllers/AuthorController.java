package com.crud_050325.Crud.Template.controllers;
import com.crud_050325.Crud.Template.domain.dto.AuthorDto;
import com.crud_050325.Crud.Template.domain.entities.AuthorEntity;
import com.crud_050325.Crud.Template.mappers.Mapper;
import com.crud_050325.Crud.Template.services.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    private AuthorService authorService;

    private Mapper<AuthorEntity, AuthorDto> authorMapper;

    public AuthorController(AuthorService authorService, Mapper<AuthorEntity, AuthorDto> authorMapper) {
        this.authorService = authorService;
        this.authorMapper = authorMapper;
    }

    @PostMapping(path =  "/authors")
    public ResponseEntity<AuthorDto> createAuthor(@RequestBody AuthorDto author) { // including responseEntity as it allows us to pass status as well
        AuthorEntity authorEntity = authorMapper.mapFrom(author);
        AuthorEntity savedAuthorEntity = authorService.createAuthor(authorEntity);
        return new ResponseEntity<>(authorMapper.mapTo(savedAuthorEntity), HttpStatus.CREATED);
    }
}
