CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    age INTEGER,
    bio TEXT,
    gender VARCHAR(20),
    city VARCHAR(100)
);

CREATE TABLE matches (
    id SERIAL PRIMARY KEY,
    user_id BIGINT,
    target_user_id BIGINT
);
