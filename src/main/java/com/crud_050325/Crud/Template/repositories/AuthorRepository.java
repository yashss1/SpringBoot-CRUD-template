package com.crud_050325.Crud.Template.repositories;

import com.crud_050325.Crud.Template.domain.entities.AuthorEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<AuthorEntity, Long> {

    @Query("Select a from AuthorEntity a where a.age < ?1")
    Iterable<AuthorEntity> ageLessThan(int age);

    @Query("SELECT a from AuthorEntity a where a.age > ?1")
    Iterable<AuthorEntity> findAuthorsWithAgeGreaterThanEqualTo(int age);
}
