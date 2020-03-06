CREATE USER john IDENTIFIED BY securepassword;

GRANT CREATE SESSION TO john;
-- This allow the user to connect to the DB

GRANT UNLIMITED TABLESPACE TO john;
-- This allows john TO CREATE AS many tables AS he wants

GRANT CREATE TABLE TO john;
-- Now john can actually CREATE tables

GRANT CREATE VIEW TO john;
GRANT CREATE SEQUENCE TO john;
GRANT CREATE TRIGGER TO john;

GRANT CREATE PROCEDURE TO john;
