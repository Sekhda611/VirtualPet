package Oop_review_point;
//2572
public class QuizMain {
    public static void main(String[] args) {


        String[] questions = {"What is the capital of Georgia? ", "What is the largest animal on the earth?", "What is the currency of Bolivia?"};
        String[] answers = {"Atlanta", "Whale", "Boliviano"};

        Quiz quiz = new Quiz(questions,answers);
        quiz.start();


    }

}
