CREATE TABLE IF NOT EXISTS auther(
    id SERIAL PRIMARY KEY ,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    age INTEGER,
    book VARCHAR[]
    );
CREATE TABLE IF NOT EXISTS book(
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    year INTEGER,
    autherID INTEGER
);