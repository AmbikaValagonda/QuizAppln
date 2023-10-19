package com.learning.quizapp.dao;

public class Quiz {
	
	int quizId;
	String quizName;
	int numQuestions;
	public Question[] questions = new Question[numQuestions];
	
	public String getQuizName() {
		return quizName;
	}
	public void setQuizName(String quizName) {
		this.quizName = quizName;
	}
	public int getQuizId() {
		return quizId;
	}
	public int getNumQuestions() {
		return numQuestions;
	}
	public void setNumQuestions(int numQuestions) {
		this.numQuestions = numQuestions;
	}
	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}
	public Question[] getQuestions() {
		return questions;
	}
	public void setQuestions(Question[] questions) {
		this.questions = questions;
	}
	
	
}
