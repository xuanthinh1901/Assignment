package railway;

import java.time.LocalDate;

public class Exam {
	int examId;
	int code;
	String title;
	int duration;
	LocalDate createDate;
	Account account;
	CategoryQuestion[] categoryQuestions;
	Question[] questions;
}
