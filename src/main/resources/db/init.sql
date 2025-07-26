CREATE DATABASE simplepp;
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

INSERT INTO users (type, name, email, password, created_at, document, document_type)
VALUES
('USER', 'User John Doe', 'user@mail.com', 'user123', '2025-07-25 00:00:00', '12345678901', 'CPF'),
('RESTRICT', 'Shopkeeper Jane Doe', 'shopkeeper@gmail.com', 'shopkeeper123', '2025-07-25 00:00:00', '98765432100', 'CPF');

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

INSERT INTO transfers (sender, recipient, amount, type, created_at)
VALUES  
(1, 2, 100.00, 'DEBIT', '2025-07-25 00:00:00'),
(2, 1, 200.00, 'CREDIT', '2025-07-25 00:00:00');
