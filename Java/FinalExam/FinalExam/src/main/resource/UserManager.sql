/*============================== CREATE DATABASE =======================================*/
/*======================================================================================*/

DROP DATABASE IF EXISTS UserManager;
CREATE DATABASE UserManager;
USE UserManager;

/*============================== CREATE TABLE =======================================*/
/*======================================================================================*/

-- create table 1: Department  id, FullName, Email, Password

/*CREATE TABLE `User`(
	Id 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	FullName0 	NVARCHAR(50) UNIQUE KEY NOT NULL,
	Email 		VARCHAR(50) UNIQUE KEY NOT NULL,
	`Password`	VARCHAR(50) NOT NULL CHECK(length(`Password`) >= 6),
	projectId	TINYINT UNSIGNED NOT NULL,
    `ROLE` 		ENUM('Manager', 'Employee')  NOT NULL,	
	FOREIGN KEY (projectId) REFERENCES `Project`(projectId)
);*/

CREATE TABLE `Manager`(
	managerId 	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	FullName1 	NVARCHAR(50) UNIQUE KEY NOT NULL,
    Email 		VARCHAR(50) UNIQUE KEY NOT NULL,
    `Password`	VARCHAR(50) NOT NULL CHECK(length(`Password`) >= 6),
    ExpInYear   TINYINT NOT NULL,
    `role`		VARCHAR(50)
);

CREATE TABLE `Project`(
	projectId 		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,			
	teamSize 		TINYINT UNSIGNED NOT NULL,
    managerId 		TINYINT UNSIGNED NOT NULL,
     FOREIGN KEY (managerId) REFERENCES `Manager`(managerId)

);
CREATE TABLE `Employee`(
	EmployeeId 	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	FullName2 	VARCHAR(50) UNIQUE KEY NOT NULL,
    Email 		VARCHAR(50) UNIQUE KEY NOT NULL,
    `Password`	VARCHAR(50) NOT NULL CHECK(length(`Password`) >= 6),
    projectId	TINYINT UNSIGNED NOT NULL,
    ProSkill	VARCHAR(50)  NOT NULL ,
    `role` 		VARCHAR(50),
     FOREIGN KEY (projectId) REFERENCES `Project`(projectId)
);


/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/

/*INSERT INTO `User`  (			FullName0, 				Email,					 `Password`	,	projectId	,`role`) 
VALUES
					(		N'Nguyễn Thị Mỵ'	,	'mynt2407@gmail.com'	, 'Mynguyen123', 1	,		'Manager'),
					(		N'Nguyễn Ngọc Duy'	,	'duynn03@gmail.com'		, 'duyNguyen'	,2	,		'Employee'),
                    (		N'Nguyễn Hùng Mạnh'	,'hungmanh@gmail.com'		, 'hunGmanh1'	,3	,		'Manager'),
                    (		N'Tống Thị Nhung'	,	'nhung@gmail.com'		, 	'nhungtOng'	,2	,		'Employee'),
                    (		N'Trần Thị Kim Anh'	,'kimoanh.tran@gmail.com'	, 'tran.kim'	,2	,		'Employee');*/

INSERT INTO `Manager`  (FullName1    , 			Email ,				 `Password`    		    ,  ExpInYear ,`role`   ) 
VALUES
					 (		N'Tống Thị Nhung11'	,	'nhung11@gmail.com'		, 	'nhungtOng11'	,1	,'Manager'		),
                    (		N'Tống Thị Nhung'	,	'nhung@gmail.com'		, 	'nhungtOng'	,	1	,'Manager'		),
                    (		N'Trần Thị Kim Anh'	,'kimoanh.tran@gmail.com'	, 'tran.kim'	,	2	,'Manager'		);
                    
INSERT INTO `Project`  ( teamSize	    , managerId 			) 
VALUES
					(			4		,	1					),
					(			3		,	1					),
                    (			2		,	3					);

INSERT INTO `Employee`  (FullName2    , 		Email ,				 `Password`    		    , projectId, ProSkill , `role`) 
VALUES
					(		N'Nguyễn Thị Mỵ'	,	'mynt2407@gmail.com'	, 'Mynguyen123'	,1		,'dev'		,'Employee'	),
					(		N'Nguyễn Ngọc Duy'	,	'duynn03@gmail.com'		, 'duyNguyen'	,2		,'java'		,'Employee'	),
                    (		N'Nguyễn Hùng Mạnh'	,'hungmanh@gmail.com'		, 'hunGmanh1'	,3		,'dev'		,'Employee'	),
					(		N'Nguyễn Văn A'	,'nguyenvanA@gmail.com'		, 'nguyenvanA'		,2		,'java'		,'Employee'	),
                    (		N'Nguyễn Văn B'	,'nguyenvanB@gmail.com'		, 'nguyenvanB'		,3		,'test'		,'Employee'	),
                    (		N'Nguyễn Văn C'	,'nguyenvanC@gmail.com'		, 'nguyenvanC'		,1		,'test'		,'Employee'	);
/*CREATE table `user1`(
			select e.EmployeeId,e.FullName2,e.Email,e.`Password`,e.`role`,p.*
			from employee e
			join project p on e.projectId=p.projectId
);
CREATE table `user2`(
			select m.FullName1,m.Email,m.`Password`,m.`role`,p.*
			from project p
			join manager m on m.managerId=p.managerId
);
CREATE TABLE `user3`(
	select * 
    from `user1`
    union
	select * 
    from `user2`
);*/


