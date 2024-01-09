CREATE TABLE IF NOT EXISTS author(
    author_id SERIAL PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    age INTEGER
    );
CREATE TABLE IF NOT EXISTS book(
    book_id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    year INTEGER,
    autherID INTEGER ,FOREIGN KEY(autherID)
        REFERENCES author(author_id)
);