CREATE DATABASE Film;
GO
USE Film;
GO

CREATE TABLE [User] (
    id INT IDENTITY(1,1) PRIMARY KEY,
    role NVARCHAR(50) NOT NULL,
    username NVARCHAR(100) UNIQUE NOT NULL,
    fullname NVARCHAR(255) NOT NULL,
    email NVARCHAR(255) UNIQUE NOT NULL,
    password NVARCHAR(255) NOT NULL
);

INSERT INTO [User] (role, username, fullname, email, password) 
VALUES 
('admin', 'admin01', 'Nguyễn Văn A', 'admin@example.com', 'hashed_password_123'),
('user', 'user01', 'Trần Thị B', 'user01@example.com', 'hashed_password_456'),
('user', 'user02', 'Lê Văn C', 'user02@example.com', 'hashed_password_789');

select * from [User]

CREATE TABLE Movies (
    id VARCHAR(50) PRIMARY KEY,
    name NVARCHAR(255) NOT NULL,
    actor NVARCHAR(255),
    category NVARCHAR(100),
    time INT,
    language NVARCHAR(50),
    image VARBINARY(MAX),  
    description NVARCHAR(MAX),
	isShowing BIT
);
select * from [User]