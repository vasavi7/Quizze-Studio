package Studio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question>questionsList;
    public Quiz(){
        questionsList = new ArrayList<Question>();
        String q = "Where does the sun rise?";
        String[] a = {"East","West","North","South"};
        questionsList.add(new Question(q, a,"East"));
        q = "Who invented the telephone?";
        a = new String[]{"Thomas Edison","Michael Faraday","James Watt","Alexander Bell"};
        questionsList.add(new Question(q, a, "Alexander Bell"));
        q = "Where is the capital of India?";
        a = new String[]{"New Delhi","Noida","Mumbai","Kolkata"};
        questionsList.add(new Question(q, a, "New Delhi"));
        Collections.shuffle(questionsList, new Random());
    }
    public void Grade() {
        Scanner scan = new Scanner(System.in);
        int numCorrect = 0;
        for (int question = 0; question < questionsList.size(); question++) {
            System.out.println(questionsList.get(question).getQuestion());
            int numChoices = questionsList.get(question).getChoices().size();
            for (int choice = 0; choice < numChoices; choice++) {
                System.out.println((choice + 1) + ":" + questionsList.get(question).getChoices().get(choice));
            }
            System.out.println("Choose correct answer:");
            int candidateAnswer = scan.nextInt();
            ArrayList<String>choiceList = questionsList.get(question).getChoices();
            String correctAnswer = questionsList.get(question).getAnswer();
            int correctAnswerIndex = choiceList.indexOf(correctAnswer);
            if(candidateAnswer == correctAnswerIndex + 1){
                numCorrect++;
            }
        }
        scan.close();
        System.out.println("You got" + numCorrect + "correct answer(s):");
    }
    }







