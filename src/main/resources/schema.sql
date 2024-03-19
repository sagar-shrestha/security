CREATE TABLE IF NOT EXISTS user
(
    user_id  INT AUTO_INCREMENT PRIMARY KEY,
    email    VARCHAR(45),
    password VARCHAR(45),
    username VARCHAR(45)
);

INSERT INTO user (email, password, username)
VALUES ('', 'admin', 'admin');