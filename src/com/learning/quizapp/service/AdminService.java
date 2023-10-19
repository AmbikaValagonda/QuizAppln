package com.learning.quizapp.service;

import java.util.Random;
import java.util.Scanner;

import com.learning.quizapp.dao.Question;
import com.learning.quizapp.dao.Quiz;

public class AdminService {
	
	private int quizId;
	private String quizName;
	
	/* Method to set quizId, quizName, numQuestions and questions to Quiz object */
	public Quiz addQuiz(int numQuestions) {
		
		Question[] questions = new Question[numQuestions];
		Scanner sc = new Scanner(System.in);
		Quiz qz = new Quiz();
		Random rand = new Random();
		
		System.out.println("Enter name of the Quiz: ");
		quizName = sc.nextLine();
				
		quizId = rand.nextInt();
		qz.setQuizId(quizId); // Setting quizId
		qz.setQuizName(quizName); // Setting quizName
		qz.setNumQuestions(numQuestions); // Setting numQuestions
		
		for(int i = 0; i<numQuestions; i++) {
			questions[i]  = addQuestion(i, numQuestions);
			
		}
		qz.setQuestions(questions); // Setting questions

		return qz;
	}
	
	/*Method to set Question. options and answer to a Question object*/
	
	public Question addQuestion(int i, int numQuestions) {
		Question q = new Question();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Question " + (i+1) + " --> ");
		String que = sc.nextLine();
		System.out.println("How many options you want to enter for this question? Max options is 4");
		int numOptions = sc.nextInt();
		q.setNumOptions(numOptions);
		q.setQuestion(que);
		
		String options[][] = new String[numQuestions][numOptions];
		Scanner sc1 = new Scanner(System.in);
		for(int j=0;j<numOptions;j++) {
			System.out.println("Enter option: " + (j+1));
			String op = sc1.nextLine();
			options[i][j] = op;
		}
			

		q.setOptions(options);
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter answer:");
		String ans = sc2.nextLine();
		q.setAnswer(ans);
		return q;
	}
	



}
