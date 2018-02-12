# Profiles schema

# --- !Ups

CREATE TABLE profiles (
    id serial primary key,
    confirmed boolean NOT NULL,
    email varchar(255),
    password varchar(255),
    firstName varchar(255),
    lastName varchar(255),
    fullname varchar(255),
    passwordInfo integer REFERENCES password_info ON DELETE CASCADE,
    isAdmin boolean NOT NULL,
);

# --- !Downs

DROP TABLE profile;