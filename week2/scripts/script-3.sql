/*
 * Stored Procedures
 * 
 * A named transaction that can be invoked when called like a function
 * A few characteristics
 * 
 * Syntax:
 * 
 * CREATE [OR REPLACE] procedure_name
 * IS
 * 		-- Section to declare variables
 * BEGIN
 * 		-- This is where you can write all of your logic
 * 		-- And you can even utilize other transactions
 * 
 * [EXCEPTION]
 * 		-- This is where you would perform exception handling
 * END;
 * 
 * How you would invoke stored procedures:
 * 
 * BEGIN
 * 		procedure_name();
 * END;
 * 
 * --or--
 * 
 * call procedure_name();
 */

CREATE OR REPLACE PROCEDURE hello_world_procedure
IS
BEGIN
	DBMS_OUTPUT.PUT_LINE('Hello World!');
	-- This is the equivalent to Java's System.out.println() method
	-- It utilizes the DB console
END;

BEGIN
	hello_world_procedure();
END;

/*
 * Procedures can allow us to define executions (transactions).
 * Most actions can be taken against a table in a procedure
 * 
 * Parameters in stored procedures are a bit unique
 * You have the following types (keywords):
 * IN
 * OUT
 * IN OUT
 * 
 * IN parameters: Whatever is passed as input during the procedure call
 * OUT parameters: Whatever is effectively returned from the procedure
 * IN OUT parameters: A variable that is used as input and then transformed
 * 		as output.
 * 
 * -- syntax: varname IN/OUT/IN OUT DATATYPE
 */

CREATE OR REPLACE PROCEDURE insert_into_temp_employees(FIRST IN VARCHAR2,
	LAST IN VARCHAR2, email IN VARCHAR2, salary IN NUMBER, title IN VARCHAR2)
IS
BEGIN
	INSERT INTO TEMPEMPLOYEES emp (first_name, last_name, email, salary, title)
		VALUES (FIRST, LAST, email, salary, title);
	COMMIT;
END;

CALL insert_into_temp_employees('Michelle', 'Ogg', 'oggalicious@gmail.com',
		250000, 'PR Manager');
SELECT * FROM TEMPEMPLOYEES t2;

CREATE OR REPLACE PROCEDURE get_full_name(
	id IN NUMBER, full_name OUT VARCHAR2)
IS
BEGIN
	SELECT first_name || ' ' || last_name
		INTO full_name
		FROM TEMPEMPLOYEES t2
		WHERE EMPLOYEE_ID = id;
END;

DECLARE -- Declare block for local variables
		-- Similar to the IS block
	INPUT NUMBER;
	RESULT VARCHAR2(220);
BEGIN
	INPUT := 202; -- This is how assignment works in PL/SQL
	get_full_name(INPUT, result);
	DBMS_OUTPUT.PUT_LINE(result);
END;

-- IN parameters are pass by value
-- OUT & IN OUT parameters are pass by reference

/*
 * A cursor is like a pointer (such as from traditional programming languages)
 * 	to a ResultSet (or query result). It points to a table or a view.
 * We can use cursors to iterate through queries/tables row by row
 * In general, if we want to pass through entire tables/queries in PL/SQL
 * we need to use a cursor
 * 
 * PL/SQL has a specific kind of cursor type called SYS_REFCURSOR
 * Cursors are uni-directional
 * 
 * The SYS_REFCURSOR 
 */

