CREATE DATABASE simplepp;
USE DATABASE simplepp;

INSERT INTO users (type, name, email, password, created_at, document, document_type)
VALUES
('USER', 'User John Doe', 'user@mail.com', 'user123', '2025-07-25 00:00:00', '12345678901', 'CPF'),
('RESTRICT', 'Shopkeeper Jane Doe', 'shopkeeper@gmail.com', 'shopkeeper123', '2025-07-25 00:00:00', '98765432100', 'CPF');

INSERT INTO transfers (sender, recipient, amount, type, created_at)
VALUES  
(1, 2, 100.00, 'DEBIT', '2025-07-25 00:00:00'),
(2, 1, 200.00, 'CREDIT', '2025-07-25 00:00:00');
