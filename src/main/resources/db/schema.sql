CREATE DATABASE IF NOT EXISTS simplepp;
USE DATABASE simplepp;

CREATE TABLE IF NOT EXISTS users (
    id BIGSERIAL PRIMARY KEY,
    type VARCHAR(50) NOT NULL,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    created_at VARCHAR(255) NOT NULL,
    document VARCHAR(255) NOT NULL UNIQUE,
    document_type VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS transfers (
    id BIGSERIAL PRIMARY KEY,
    sender BIGINT NOT NULL,
    recipient BIGINT NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    type VARCHAR(50) NOT NULL,
    created_at VARCHAR(255) NOT NULL,
    FOREIGN KEY (origin_user_id) REFERENCES users(id),
    FOREIGN KEY (destination_user_id) REFERENCES users(id)
);

