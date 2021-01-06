DROP DATABASE IF EXISTS Testing_System_Assignment;
CREATE DATABASE Testing_System_Assignment;
USE Testing_System_Assignment;

CREATE TABLE Department(   
	DepartmentID  		INT,
    DepartmentName 		NVARCHAR(50)
);
CREATE TABLE `Position`(
	PositionID 			INT,
    PositionName 		NVARCHAR(50)
);
CREATE TABLE `Account`(
	AccountID 			VARCHAR(50),
    Email				VARCHAR(50),
    Username 			VARCHAR(50),
    Fullname			NVARCHAR(50),
    DepartmentID		INT,
    PositionID			INT,
    CreateDate 			DATE
);
CREATE TABLE `Group`(
	GroupID 			INT,
    GroupName			NVARCHAR(50),
    CreaterID			INT,
    CreaterDate 		DATE
); 
CREATE TABLE `GroupAccount`(
	GroupID				INT,
    AccountID			INT,
    JoinDate 			DATE
);
CREATE TABLE TypeQuestion(
	TypeID 				INT,
    TypeName 			VARCHAR(50),
);
CREATE TABLE CategoryQuestion(
	CategoryID 			INT,
    CategoryName		VARCHAR(50)
);
CREATE TABLE Question(
	QuestionID			INT,
    Content				VARCHAR(100),
    CategoryID			INT,
    TypeID 				INT,
    CreatorID			INT,
    CreateDate			DATE
);
CREATE TABLE Exam(
	ExamID 				INT,
    `Code`				VARCHAR(10),
    Title				VARCHAR(50),
    CategoryID			VARCHAR(50),
    Duration			DATE,
    CreatorID			INT,
    CreateDate			DATE
);
CREATE TABLE Examquestion(
	ExamID				INT,
    QuestionID			INT
);



















