package railway;

import java.time.LocalDate;

public class ProgramMain {
	public static void main(String[] args) {

		// create department
		Department department1 = new Department();
		department1.departmentId = 11;
		department1.departmentName = "Sale";

		Department department2 = new Department();
		department2.departmentId = 12;
		department2.departmentName = "Maketing";

		Department department3 = new Department();
		department3.departmentId = 13;
		department3.departmentName = "Management";

		// create position
		Position position1 = new Position();
		position1.positionId = 21;
		position1.positionName = "DEV";

		Position position2 = new Position();
		position2.positionId = 22;
		position2.positionName = "PM";

		Position position3 = new Position();
		position3.positionId = 23;
		position3.positionName = "TEST";

		// create group
		Group groupA = new Group();
		groupA.groupId = 41;
		groupA.groupName = "Nhom A";
		groupA.createDate = LocalDate.now();
		
		Group groupB = new Group();
		groupB.groupId = 42;
		groupB.groupName = "Nhom B";
		groupB.createDate = LocalDate.now();

		Group groupC = new Group();
		groupC.groupId = 43;
		groupC.groupName = "Nhom C";
		groupC.createDate = LocalDate.now();

		// create account
		Account account1 = new Account();
		account1.accountId = 31;
		account1.userName = "nguyenvananh31";
		account1.fullName = "Nguyen Van Anh";
		account1.email = "nguyenvananh11@gmail.com";
		account1.department = department1;
		account1.position = position1;
		account1.createDate = LocalDate.now();
		
		Account account2 = new Account();
		account2.accountId = 32;
		account2.userName = "phanquanganh32";
		account2.fullName = "phan Quang Anh";
		account2.email = "phanquanganh32@gmail.com";
		account2.department = department2;
		account2.position = position2;
		account2.createDate = LocalDate.now();
		
		Account account3 = new Account();
		account3.accountId = 33;
		account3.userName = "trannhuha33";
		account3.fullName = "Tran Nhu Ha";
		account3.email = "trannhuha33@gmail.com";
		account3.department = department2;
		account3.position = position2;
		account3.createDate = LocalDate.now();
		
		Account[] account_groupA=  { account1 ,account2 };
		groupA.accounts= account_groupA;

		Account[] account_groupB=  { account3 ,account2 };
		groupA.accounts= account_groupB;
		
		Account[] account_groupC=  { account1 };
		groupA.accounts= account_groupC;
		
		Group[] group_account1=  { groupA ,groupB };
		account1.groups= group_account1;
		
		Group[] group_account2=  { groupA ,groupC};
		account1.groups= group_account2;
		
		Group[] group_account3=  { groupC ,groupB };
		account1.groups= group_account3;
		
		

		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.typeId = 61;
		typeQuestion1.typeName = "Essay";

		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.typeId = 62;
		typeQuestion2.typeName = "MultipleChoice";

		// create CategoryQuestion
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.categoryId = 71;
		categoryQuestion1.categoryName = "JAVA";

		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.categoryId = 72;
		categoryQuestion2.categoryName = "C#";

		// create Question
		Question question1 = new Question();
		question1.questionId = 81;
		question1.content = "Ngon ngu C# ra doi nam nao?";
		question1.categoryQuestion = categoryQuestion1;
		question1.typeQuestion = typeQuestion1;
		question1.account = account1;
		question1.createDate = LocalDate.now();

		Question question2 = new Question();
		question2.questionId = 77;
		question2.content = "Ngon ngu C++ ra doi nam nao?";
		question2.categoryQuestion = categoryQuestion2;
		question2.typeQuestion = typeQuestion2;
		question2.account = account2;
		question2.createDate = LocalDate.now();

		// create Answer
		Answer answer1 = new Answer();
		answer1.answerId = 91;
		answer1.content = "Nam 2000";
		answer1.isCorrect = true;

		Answer answer2 = new Answer();
		answer2.answerId = 92;
		answer2.content = "Nam 1988";
		answer2.isCorrect = false;

		Answer answer3 = new Answer();
		answer3.answerId = 93;
		answer3.content = "Nam 1995";
		answer3.isCorrect = true;

		// create Exam
		Exam exam1 = new Exam();
		exam1.examId = 101;
		exam1.code = 1001;
		exam1.title = "Bai kiem tra so 1";
		exam1.categoryQuestions = new CategoryQuestion[] { categoryQuestion1, categoryQuestion2 };
		exam1.duration = 90;
		exam1.account = account1;
		exam1.createDate = LocalDate.now();
		exam1.questions = new Question[] { question1, question2 };

		Exam exam2 = new Exam();
		exam2.examId = 102;
		exam2.code = 1002;
		exam2.title = "Bai kiem tra so 2";
		exam1.categoryQuestions = new CategoryQuestion[] { categoryQuestion1 };
		exam2.duration = 90;
		exam1.account = account1;
		exam2.createDate = LocalDate.now();
		exam2.questions = new Question[] { question1 };


		System.out.println("Thong tin phong ban 1: ");
		System.out.println("ID:" + department1.departmentId);
		System.out.println("Name:" + department1.departmentName);

		System.out.println("Thong tin chuc vu nhan vien 2");
		System.out.println("ID:" + position2.positionId);
		System.out.println("Name:" + position2.positionName);

		System.out.println("Thong tin ve account 3 : ");
		System.out.println("ID : " + account3.accountId);
		System.out.println("Email : " + account3.email);
		System.out.println("Username : " + account3.userName);
		System.out.println("Ho va ten : " + account3.fullName);
		System.out.println("phong ban : " + account3.department);
		System.out.println("Chuc vu : " + account3.position);
		System.out.println("Ngay tao tai khoan : " + account3.createDate);
		
		
		

	}

}
