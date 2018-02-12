# Users schema

# --- !Ups

CREATE TABLE users (
    id serial primary key,
    email varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    fullname varchar(255) NOT NULL,
    isAdmin boolean NOT NULL,
    fk_profileId bigint
);

# --- !Downs

DROP TABLE users;