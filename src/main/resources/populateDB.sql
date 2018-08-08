DELETE FROM users;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (email, password) VALUES
  ('User1', '1111'),
  ('User2', '1111'),
  ('User3', '1111'),
  ('User4', '1111');

