# password_info schema

# --- !Ups

CREATE TABLE password_info (
    id serial primary key,
    hasher varchar(255),
    password varchar(255),
    salt varchar(255)
);

# --- !Downs

DROP TABLE password_info;