CREATE TABLE customers (
  username VARCHAR(45) NOT NULL ,
  name VARCHAR(45) NOT NULL ,
  password VARCHAR(255) NOT NULL ,
  enabled TINYINT NOT NULL DEFAULT 1 ,
  PRIMARY KEY (username));

CREATE TABLE user_roles (
  user_role_id int NOT NULL AUTO_INCREMENT,
  username varchar(45) NOT NULL,
  role varchar(45) NOT NULL,
  PRIMARY KEY (user_role_id),
  UNIQUE KEY uni_username_role (role,username),
  KEY fk_username_idx (username),
  CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES customers (username));

INSERT INTO customers(username,name,password,enabled)
VALUES ('admin','admin','$2y$12$G3NKKQYjmLnsWI3g/zKlne6RjigHlwGcaa9kFm1RNvXgPs9pM0xTe', true);
INSERT INTO customers(username,name,password,enabled)
VALUES ('hmouloudi','Hicham Mouloudi','$2y$12$SWC.iD76jZua0QsRnDk8KOU22Ht9aZbZ3HSDWDH2bZNVsreYpadv6', true);

INSERT INTO user_roles (username, role) VALUES ('admin', 'ROLE_USER');
INSERT INTO user_roles (username, role) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO user_roles (username, role) VALUES ('hmouloudi', 'ROLE_USER');
