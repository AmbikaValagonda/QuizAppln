package com.learning.quizapp.main;

//import java.util.Scanner;
import com.learning.quizapp.dao.Quiz;
import com.learning.quizapp.service.QuizUtilService;

public class LaunchQuizApp {
	

	public static void main(String[] args) {
		
		
		QuizUtilService qu = new QuizUtilService();
		
		System.out.println("Welcome to Quiz Application !");
		System.out.println();
		
		// Calling adminMode() method to create quiz which will return an array of Quiz's created quizList[].
		Quiz quizList[] = qu.adminMode();
		
		// Calling playerMode() method to which we pass quizList[] to iterate and play.
		qu.playerMode(quizList);
		
		
		
		/***  Below Logic is to decide Admin or Player.Can be used later after learning DB/file storage concept. *** /
		
		/*int userOption;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose an option: (1) Admin  (2)Player");
		
		userOption = sc.nextInt();
		
		switch(userOption) {
			case 1:
				Quiz quizList[] = qu.adminMode();
				break;
			case 2:
				qu.playerMode();
				break;
			default:
				System.out.println("Invalid option");
				break;
			
		}*/
		
		
	}

	

}
