DROP TABLE tempemployees CASCADE CONSTRAINTS;
CREATE TABLE tempemployees (
	employee_id NUMBER(38) PRIMARY KEY,
	first_name VARCHAR2(50) NOT NULL CHECK (LENGTH(first_name) > 1),
 	last_name VARCHAR2(50) NOT NULL,
	email VARCHAR2(55) UNIQUE,
	salary NUMBER NOT NULL,
	title VARCHAR2(55)
);

/*INSERT INTO tempemployees (first_name, last_name, salary, title)
  VALUES ('John', 'Smith', 50000, 'Employee');*/
-- The above statement should fail

/*
 * Oracle has an extension called "PL/SQL" (Procedural Language/ SQL)
 * -It provides tools that we can use with SQL such as:
 * 		- Functions
 * 		- Stored Procedures
 * 		- Sequences
 * 		- Triggers
 * It is effectively a programming language inside SQL, specifically Oracle SQL
 */

-- SEQUENCE
/*
 * A sequence is an object that will maintain a counter for you
 * Think of this in terms of a mathematics sequence
 */

DROP SEQUENCE temp_seq;
CREATE SEQUENCE temp_seq
	START WITH 42
	INCREMENT BY 8;

-- My goal with this sequence is to replicate
-- OracleSQL's auto-incrementing primary keys feature
-- Normally, we might just start with 1 and increment by 1

-- We need to create a trigger that will perform an operation
-- when we are about to insert into our new tempemployees table
-- Specifically, we will need to update the employee_id field to
-- the next value in our sequence so that the insert statement
-- no longer has a null

/*
 * A trigger is an object that we can create that waits for
 * actions to occur on a specific table that the trigger
 * was created for.
 * A trigger can coded to react to most CRUD operations
 * (except for SELECT)
 */

DROP TRIGGER tmp_emp_seq_trg;
CREATE OR REPLACE TRIGGER tmp_emp_seq_trg
-- We can apply the trigger before or after the action applies
	BEFORE INSERT ON tempemployees
	FOR EACH ROW -- We can apply FOR EACH ROW OR STATEMENT
	BEGIN -- This keyword signifies a block for a transaction
		IF :NEW.employee_id IS NULL THEN
			SELECT temp_seq.nextval INTO :NEW.employee_id FROM DUAL;
		END IF;
	END;

INSERT INTO tempemployees (first_name, last_name, salary, title)
  VALUES ('John', 'Smith', 50000, 'Employee');
-- This insert now succeeds