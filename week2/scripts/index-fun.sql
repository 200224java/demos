DROP TABLE index_table;
CREATE TABLE index_table (
	value NUMBER
);

INSERT INTO index_table VALUES (1);
INSERT INTO index_table VALUES (2);
INSERT INTO index_table VALUES (3);
INSERT INTO index_table VALUES (4);
INSERT INTO index_table VALUES (5);
INSERT INTO index_table VALUES (6);
INSERT INTO index_table VALUES (7);
INSERT INTO index_table VALUES (8);
INSERT INTO index_table VALUES (9);

CREATE INDEX index_name ON index_table (value);

INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
/*INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);
INSERT INTO index_table (SELECT * FROM index_table);*/

--SELECT COUNT(value) FROM index_table;