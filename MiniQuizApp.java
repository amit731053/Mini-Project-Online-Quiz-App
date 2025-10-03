package Internship;

import java.util.*;

class Question{
    String questionText;
    String[] options;
    int correctOption;

    Question(String questionText,String[] options,int correctOption)
    {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;

    }
}


public class MiniQuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> question = new ArrayList<>();
        question.add(new Question("Which language is used for Android Development?",
                new String[]{"1. Python", "2. Java", "3. C++", "4. Kotlin"},4));

        question.add(new Question("What is the capital of India?",
                new String[]{"1. Mumbai", "2. Delhi", "3. Kolkata", "4. Chennai"}, 2));

        question.add(new Question("Which data structure uses FIFO?",
                new String[]{"1. Stack", "2. Queue", "3. Tree", "4. Graph"}, 2));

        int score = 0;

        for(int i=0;i<question.size();i++)
        {
            Question q = question.get(i);
            System.out.println("\nQ" + (i + 1) + ": " + q.questionText);

            for(String option : q.options)
            {
                System.out.println(option);
            }
            System.out.print("Your answer (1-4): ");
            int userAns = sc.nextInt();

            if(userAns == q.correctOption)
            {
                System.out.println("Correct!");
                score++;
            }
            else {
                System.out.println("Wrong! Correct Answer: " + q.correctOption);
            }
        }
        System.out.println("\nQuiz Completed!");
        System.out.println("Your Score: " + score + "/" + question.size());

        sc.close();
    }
}
