# Spring-data-jdbc examples

This module holds examples on how to use spring-data-jdbc.

## Simple example
The entity ``SimpleBook`` defines a few direct attributes.
The table backing this entity is defined in the ``schema.sql`` file.
ID generation is done on database level by defining the ``IDENTITY`` column.

A small extra in this example is the method ``SimpleBook.withId(...)`` this is used by spring-data-jdbc to create an immutable response object and adding the id to the existing one. Otherwise the all-arguments constructor would be used.

## Links
* [Spring-data-jdbc reference](https://docs.spring.io/spring-data/jdbc/docs/current/reference/html)