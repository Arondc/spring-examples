CREATE TABLE IF NOT EXISTS simple_book
(
    id IDENTITY PRIMARY KEY ,
    isbn VARCHAR(20),
    title VARCHAR(200),
    author VARCHAR(200),
    number_Of_Pages BIGINT
);