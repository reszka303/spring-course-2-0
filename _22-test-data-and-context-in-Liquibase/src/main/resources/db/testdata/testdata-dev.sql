-- liquibase formatted sql
-- context: dev
-- changeset reszka:1

INSERT INTO
    product(name, price, description)
VALUES
    ('mleko', 3.2, 'developerski opis mleka'),
    ('czekolada', 2.8, 'developerski opis czekolady'),
    ('jogurt', 1.59, 'developerski opis jogurtu'),
    ('chleb', 3.8, 'developerski opis chleba'),
    ('masło', 4.99, 'developerski opis masła');