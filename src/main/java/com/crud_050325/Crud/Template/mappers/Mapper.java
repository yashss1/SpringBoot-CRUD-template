package com.crud_050325.Crud.Template.mappers;

public interface Mapper<A,B> {

    B mapTo(A a);

    A mapFrom(B b);
}
