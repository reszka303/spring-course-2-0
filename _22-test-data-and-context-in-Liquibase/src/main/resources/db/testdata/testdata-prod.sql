-- liquibase formatted sql
-- context: prod
-- changeset reszka:1

INSERT INTO
    product(name, price, description)
VALUES
    ('mleko', 3.2, 'produkcyjny opis mleka'),
    ('czekolada', 2.8, 'produkcyjny opis czekolady'),
    ('jogurt', 1.59, 'produkcyjny opis jogurtu'),
    ('chleb', 3.8, 'produkcyjny opis chleba'),
    ('masło', 4.99, 'produkcyjny opis masła');