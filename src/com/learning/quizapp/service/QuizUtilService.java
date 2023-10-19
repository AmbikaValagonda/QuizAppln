package com.learning.quizapp.service;

import java.util.Scanner;

import com.learning.quizapp.dao.Quiz;

public class QuizUtilService {
	
	
	/* Method to call AdminService */
	public Quiz[] adminMode() {

		Quiz quiz = new Quiz();
		AdminService ad = new AdminService(); 
		Scanner sc = new Scanner(System.in);
		
		//Take quiz Count input from admin 
		System.out.println("Admin, Please enter the number of Quiz's you want to create ");
		int quizCount = sc.nextInt();
		
		//q[] is created to hold the details of each quiz.
		Quiz q[] = new Quiz[quizCount];
		
		System.out.println();
		
		/* Logic to add quiz details */
		for(int i=0; i<quizCount;i++) {
			System.out.println("                   ------ Adding Quiz " + (i+1) + " ------ ");
			System.out.println();
			//Take questions Count input from admin 
			System.out.println("Admin!  Please enter the number of Questions's you want to create in for Quiz " + (i+1));
			
			int numQuestions = sc.nextInt();
			quiz = ad.addQuiz(numQuestions);
			q[i] = quiz;
			
			System.out.println("Added quiz " + (i+1) + " Successfully");
			System.out.println("_____________________________");
			System.out.println();
		}
		return q;
	}
	
	
	/* Method to call PlayerService */
	public void playerMode(Quiz q[]) {

		PlayerService ps = new PlayerService();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number of avialable Quizes to play are: " + q.length);
		System.out.println();
		
		// Displays Quiz Names's to play.
		System.out.println("Choose the Quiz you want to play from below list: ");
		for(int i=0; i<q.length;i++) {
			System.out.println(q[i].getQuizName());
		}
		//Get user option of quiz to play
		String userOption = sc.nextLine();
		
		// Loops through Quiz list and displays only selected quiz to play.
		
		for(int i=0; i<q.length;i++) {
			if(q[i].getQuizName().equals(userOption)) {
				System.out.println();
				System.out.println("********** Playing the Quiz " + q[i].getQuizName() + " and the Quiz Id is "+ q[i].getQuizId() + "**********");
				int score = ps.playQuiz(q[i]);
				System.out.println("Score is: " + score + " out of " + q[i].getNumQuestions() * 2);
				System.out.println("_____________________________");
			}
		}
	}

	

}
