import java.util.*;
import java.util.ArrayList;

public class Chatbot {

    private ArrayList<String> questions;

    public Chatbot(){
        //initializes question list
        questions = new ArrayList<String>();
        questions.add("What's your favorite form of social media?");
        questions.add("What was the last good book you read?");
        questions.add("Have you done anything exciting lately?");
        questions.add("Have you been on any interesting trips lately?");
        questions.add("Are you a cat person or a dog person?");
    }

    public void randomQuestion(){
        //pick a random question from the questionlist
        if (!questions.isEmpty()) {
            int index = new Random().nextInt(questions.size()) ;
            System.out.println(questions.get(index));
            questions.remove(index);
        } else {
            System.out.println("Oops, I ran out of questions!");
            endConversation();
        }
    }

    public void endConversation() {
        System.out.println("It was nice talking to you. Hope your study goes well!");
        System.exit(0);
    }
    
}