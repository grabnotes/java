CREATE TABLES:
===============
CREATE TABLE application_user(
	id MEDIUMINT NOT NULL AUTO_INCREMENT,
	name VARCHAR(50) NULL,
	age INT NULL,
	PRIMARY KEY (id)
) ENGINE=INNODB;
ALTER TABLE application_user AUTO_INCREMENT = 10001;
INSERT INTO application_user(name,age) VALUES ( 'john', 20);