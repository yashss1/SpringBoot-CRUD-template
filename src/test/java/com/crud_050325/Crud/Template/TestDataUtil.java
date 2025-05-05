package com.crud_050325.Crud.Template;

import com.crud_050325.Crud.Template.domain.entities.AuthorEntity;
import com.crud_050325.Crud.Template.domain.entities.BookEntity;

public final class TestDataUtil {

    private TestDataUtil() {}

    public static AuthorEntity createTestAuthorEntityA() {
        return AuthorEntity.builder()
//                .id(1L)
                .name("Yash Sonawane")
                .age(23)
                .build();
    }

    public static AuthorEntity createTestAuthorEntityB() {
        return AuthorEntity.builder()
//                .id(2L)
                .name("Prutha Rinke")
                .age(22)
                .build();
    }

    public static AuthorEntity createTestAuthorEntityC() {
        return AuthorEntity.builder()
//                .id(3L)
                .name("Aditya Sonawane")
                .age(20)
                .build();
    }

    public static BookEntity createTestBookA(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("978-1-2345-6789-0")
                .title("The Shadow in the Attic")
                .authorEntity(authorEntity)
                .build();
    }

    public static BookEntity createTestBookB(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("978-1-2345-6789-1")
                .title("Beyond the Horizon")
                .authorEntity(authorEntity)
                .build();
    }

    public static BookEntity createTestBookC(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("978-1-2345-6789-2")
                .title("The Last Ember")
                .authorEntity(authorEntity)
                .build();
    }
}
