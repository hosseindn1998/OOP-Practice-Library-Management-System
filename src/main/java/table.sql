CREATE TABLE IF NOT EXISTS auther(
    id SERIAL PRIMARY KEY ,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    age INTEGER,
    book VARCHAR[]
    );