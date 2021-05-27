package Studio;

import java.util.ArrayList;
import java.util.Collections;

public class Question {
    private String question;
    private String answer;
    private ArrayList<String> choices;
    public Question(String question,String[]choices,String answer){
        this.question = question;
        this.choices = new ArrayList<String>();
        for(int i=0;i<choices.length;i++){
            this.choices.add(choices[i]);
        }
        Collections.shuffle(this.choices);
        this.answer = answer;

    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }
}
