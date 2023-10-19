package com.learning.quizapp.dao;

public class Question {

	private String question;
	private int numOptions;
	private String options[][];
	private String answer;
	
	
	public int getNumOptions() {
		return numOptions;
	}
	public void setNumOptions(int numOptions) {
		this.numOptions = numOptions;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String[][] getOptions() {
		return options;
	}
	public void setOptions(String[][] options) {
		this.options = options;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	

}
