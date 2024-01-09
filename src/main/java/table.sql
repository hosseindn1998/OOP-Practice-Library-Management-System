CREATE TABLE IF NOT EXISTS author(
    id SERIAL PRIMARY KEY ,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    age INTEGER,
    book Book[]
    );
CREATE TABLE IF NOT EXISTS book(
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    year INTEGER,
    autherID INTEGER
);