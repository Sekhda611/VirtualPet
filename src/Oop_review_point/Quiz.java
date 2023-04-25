package Oop_review_point;
import java.util.Scanner;
//prigram
public class Quiz {
    private String[] questions;
    private  String[] answers;

    //constructor
    public Quiz(String[] questions, String[] answers){
        this.questions = questions;
        this.answers = answers;
    }
    public void start(){
        Scanner input = new Scanner(System.in);
        int score = 0;
        for(int i = 0; i < questions.length; i++){
            System.out.print(questions[i]);
            String userAnswer = input.nextLine();
            if (userAnswer.equalsIgnoreCase(answers[i])){
                System.out.println("Coorect");
                score++;
            }
            else{

            }
        }
    }
}
