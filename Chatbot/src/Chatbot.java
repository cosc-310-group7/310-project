import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Chatbot {

    ArrayList<String> questions;


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
        int index = new Random().nextInt(questions.size()) ;
        String randomQuestion = questions.get(index);
        System.out.println(randomQuestion);
    }

    public Boolean checkState(String s){

        if (s.toLowerCase().contains("end the conversation")) {
            return false;
        }

        return true;
    }

    public void endConversation() {
        System.out.println("It's nice talking to you. Hope your study goes well!");
    }
    
}