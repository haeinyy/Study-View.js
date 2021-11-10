DROP SCHEMA IF EXISTS ssafyhw;
CREATE SCHEMA IF NOT EXISTS ssafyhw DEFAULT CHARACTER SET utf8mb4 COLLATE=utf8mb4_0900_as_cs;
USE ssafyhw;

DROP TABLE IF EXISTS product;
CREATE TABLE IF NOT EXISTS product (
  code char(12) NOT NULL,
  title varchar(100) NOT NULL,
  company varchar(50) NOT NULL,
  price int NOT NULL,
  content text,
  img varchar(100) DEFAULT NULL,
  PRIMARY KEY (code)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_cs;


DROP TABLE IF EXISTS comments;
CREATE TABLE IF NOT EXISTS comments (
  comment_no int NOT NULL AUTO_INCREMENT,
  user_name varchar(16) NOT NULL,
  comment varchar(500) NOT NULL,
  comment_time timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  code char(12) NOT NULL,
  PRIMARY KEY (comment_no),
  KEY comment_isbn_idx (code),
  CONSTRAINT comment_isbn FOREIGN KEY (code) REFERENCES product (code)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_cs;

SELECT * FROM product;
SELECT * FROM comments;
