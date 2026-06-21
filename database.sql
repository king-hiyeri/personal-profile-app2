CREATE TABLE Profile (
studentId VARCHAR(20) PRIMARY KEY,
name VARCHAR(100),
program VARCHAR(100),
email VARCHAR(100),
hobbies VARCHAR(255),
intro VARCHAR(500)
);

INSERT INTO Profile VALUES
('001','Ali','Computer Science','ali@gmail.com','Gaming','Hello'),
('002','Aiman','Actuarial Science','aiman@gmail.com','Reading','Hi World!'),
('003','Adam','Computer Science','adam@gmail.com','Singing','I like to sing.');