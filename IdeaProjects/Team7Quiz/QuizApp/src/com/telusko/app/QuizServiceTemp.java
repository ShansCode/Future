package com.telusko.app;

import java.lang.foreign.Linker.Option;
import java.util.Scanner;

public class QuizServiceTemp
{

    int nums[] = new int[2]; // array of 5 integer
    Question[] questions = new Question[2]; // array of References

    public QuizServiceTemp() {
    	// Here we have to make take the Question from the User
    	
        //questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4", null);
        //questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8", null);
        //questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2", null);
        //questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8", null);
        //questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1", null);
    	System.out.println("Hi Trainer you need to prepare the Quiz. So Lets Start");
    	Scanner scanner = new Scanner(System.in);
    	for(int i=0; i<2; i++){
    		int count = i + 1;
    		System.out.println("Kindly enter details for Question Number : " + count);
    		String title = scanner.nextLine();
    		System.out.println("Kindly Enter the Value for Option 1");
    		String option1 = scanner.nextLine();
    		System.out.println("Kindly Enter the Value for Option 2");
    		String option2 = scanner.nextLine();
    		System.out.println("Kindly Enter the Value for Option 3");
    		String option3 = scanner.nextLine();
    		System.out.println("Kindly Enter the Value for Option 4");
    		String option4 = scanner.nextLine();
    		System.out.println("Kindly Enter the Correct Option");
    		String correctAnswer = scanner.nextLine();
    		questions[i] = new Question(i, title, option1, option2, option3, option4, correctAnswer, null);
    		System.out.println();
    	}
    }

    public void playQuiz() {
    	System.out.println("Hi Player Ready to Play the Quiz");
    	Scanner scanner = new Scanner(System.in);
    	int score = 0;
        for(Question q : questions)
        {
            System.out.print(q.toString());
            String userInput = scanner.nextLine();
            if(userInput.equalsIgnoreCase(q.getCorrectAnswer())) {
            	score = score + 2;
            }else {
            	score = score - 1;
            }
        }
        System.out.println("Player your score is : " + score);
    }
}
