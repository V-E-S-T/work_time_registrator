DELETE FROM users;
-- ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (id, email, password) VALUES
  ('1', 'User1', '1111'),
  ('2', 'User2', '1111'),
  ('3', 'User3', '1111'),
  ('4', 'User4', '1111');

