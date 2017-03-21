CREATE TABLE IF NOT EXISTS Todo(id IDENTITY PRIMARY KEY, done BOOLEAN, text VARCHAR(100));
DELETE FROM Todo;
INSERT INTO Todo VALUES(1, true, 'Prepare presentation');
INSERT INTO Todo VALUES(2, false, 'Procastinate');
INSERT INTO Todo VALUES(3, false, 'Have presentation');
INSERT INTO Todo VALUES(4, true, 'Upload code to GitHub');