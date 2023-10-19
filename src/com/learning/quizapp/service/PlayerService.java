package com.learning.quizapp.service;

import java.util.Scanner;

import com.learning.quizapp.dao.Question;
import com.learning.quizapp.dao.Quiz;

public class PlayerService {
	
	private int score;
	Scanner sc = new Scanner(System.in);
		
	/* Method to iterate through each questions in a quiz */
	
	public int playQuiz(Quiz quiz) {
		for(int i=0; i<quiz.getNumQuestions(); i++) {
			System.out.println();
			System.out.println("=> Question " + (i+1));
			getQuestion(quiz.questions[i], i);
			
		}
		return score;
	}

	
	/* Method to display options of each question */
	
	public void getQuestion(Question q, int i) {
		String userOption;
		System.out.println();
		System.out.println(q.getQuestion());
		System.out.println("Choose an Option from below or Type 'S' to skip the question");
		

		for(int k=0; k<q.getNumOptions();k++) {
			System.out.println(q.getOptions()[i][k]);
		}

		userOption = sc.nextLine();
		if(userOption.equalsIgnoreCase(q.getAnswer())){
			System.out.println("Correct answer");
			score = score + 2;
		}
		else if(userOption.equalsIgnoreCase("S")) {
			System.out.println("You have skipped the answer and you will not get any score!");
		}
		else {
			System.out.println("Wrong answer " + "Correct answer is: " + q.getAnswer());
			score = score - 1;
		}
	}
}
