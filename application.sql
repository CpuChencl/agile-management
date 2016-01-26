CREATE DATABASE agile
  CHARACTER SET utf8;

use agile;
-- User, Roles, Function  begin
CREATE TABLE USER (
  id VARCHAR(100) NOT NULL UNIQUE, -- user num
  name VARCHAR(100),
  pwd VARCHAR(20),
  email VARCHAR(50),
  phone VARCHAR(15),
  status BIT default 1, -- 1 active, 2 closed
  create_date TIMESTAMP
);

CREATE TABLE ROLES (
  id   INT NOT NULL UNIQUE,
  name VARCHAR(100)
);

CREATE TABLE FUNCTION (
  id INT NOT NULL UNIQUE,
  name VARCHAR(100),
  pid INT
);

CREATE TABLE USER_ROLES (
  user_id VARCHAR(100) NOT NULL,
  role_id INT          NOT NULL
);

CREATE TABLE FUNCTION_ROLES (
  function_id INT NOT NULL,
  role_id INT NOT NULL
);
-- User, Roles, Function end






-- Application Data Initialization
INSERT INTO ROLES VALUES (0, 'ROLE_ROOT');
INSERT INTO ROLES VALUES (1, 'ROLE_ADMIN');
INSERT INTO ROLES VALUES (2, 'ROLE_USER');

INSERT INTO FUNCTION VALUES (1, 'SUBMIT-DOC', NULL);
INSERT INTO FUNCTION VALUES (2, 'DOWNLOAD-DOC', NULL);

INSERT INTO FUNCTION_ROLES VALUES (1, 0);
INSERT INTO FUNCTION_ROLES VALUES (2, 0);
INSERT INTO FUNCTION_ROLES VALUES (1, 1);
INSERT INTO FUNCTION_ROLES VALUES (2, 1);
INSERT INTO FUNCTION_ROLES VALUES (1, 2);

-- Create a super user account which's username/password are  root/root
insert into USER values('root','root','root',null,null,1,now());
insert into USER_ROLES values('root',0);





