DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START 100000;

CREATE TABLE users
(
  id               INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  email            VARCHAR                 NOT NULL,
  password         VARCHAR                 NOT NULL,
  startTime        TIMESTAMP               NOT NULL,
  endTime          TIMESTAMP               NOT NULL,
  fullWorkTime     INTEGER                 NOT NULL,
  atWork           BOOL DEFAULT FALSE      NOT NULL
);