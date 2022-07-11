CREATE TABLE User (
   uid        	 BIGINT          PRIMARY KEY AUTO_INCREMENT,
   name        	VARCHAR(20)   	 NOT NULL,
   ssn       	 VARCHAR(14)     NOT NULL,
   userid		VARCHAR(20)		 NOT NULL,
   passwd     	 VARCHAR(16)   	 NOT NULL,
   email		 VARCHAR(20)	 NOT NULL,
   addr			 VARCHAR(14)	NOT NULL,
   regDate     	 TIMESTAMP     	 NOT NULL	 DEFAULT CURRENT_TIMESTAMP
)

SELECT * FROM User;

DELETE FROM User WHERE name = "박상규"; 

drop table User;