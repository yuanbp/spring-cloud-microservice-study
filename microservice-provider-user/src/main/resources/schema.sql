drop table if exists user;
create table user
(
  id VARCHAR(36) NOT NULL,
  username VARCHAR(255),
  age INT,
  PRIMARY KEY(id)
)