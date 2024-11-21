package com.telusko.app;

public class Question {
	private int qid;
    public Question(int qid, String title, String option1, String option2, String option3, String option4,
			String correctAnswer, String userInput) {
		super();
		this.qid = qid;
		this.title = title;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correctAnswer = correctAnswer;
		this.userInput = userInput;
	}
	private String title;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String correctAnswer;
    private String userInput;
    
    public String getCorrectAnswer() {
    	if(correctAnswer.equalsIgnoreCase("1")) {
    		return option1;
    	}else if(correctAnswer.equalsIgnoreCase("2")) {
    		return option2;
    	}else if(correctAnswer.equalsIgnoreCase("3")) {
    		return option3;
    	}else if(correctAnswer.equalsIgnoreCase("4")) {
    		return option4;
    	}
		return correctAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public String getUserInput() {
		return userInput;
	}
	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}
	
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	@Override
	public String toString() {
		return "Question : " + title + "?" 
				+  '\n' 
				+ "Option 1 : " + option1
				+  '\n'
				+ "Option 2 : " + option2
				+  '\n'
				+ "Option 3 : " + option3
				+  '\n'
				+ "Option 4 : " + option4
				+  '\n';
	}
}