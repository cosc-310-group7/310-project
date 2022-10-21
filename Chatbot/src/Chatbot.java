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
    
    public void answerList(String answer, int questionsIndex) {
 
    	int questionsIndex;
    	
    	//laying out answers for each question by question index
    	switch (qursionsIndex) {
    	  case 0:
    		  if (answer == "facebook") {
    	    	System.out.println("Cool, this used to be the king of all social medias");
    	    } else if (answer == "instagram") {
    	    	System.out.println("Cool, you must like pictures, this is the go to platform for great photographs");
    	    }else if (answer == "tiktok") {
    	    	System.out.println("Cool, this started out as a fun rythem lip singing and dancing platform, it has been super popular these recent years ");
    	    }else if (answer == "snapchat") {
    	    	System.out.println("Cool, this is a fun chating app with features such as delete after seen, they started out small but quickly became popular among young people");
    	    }else {
    	    	System.out.println("Sorry, I don't know that one, but it sounds like fun");
    	    }
    	    break;
    	  case 1:
    		  if (answer == "Harry Potter") {
      	    	System.out.println("Wow, a classic");
      	    } else if (answer == "1984") {
      	    	System.out.println("Wow, a political classic");
      	    }else if (answer == "One Hundred Years of Solitude") {
      	    	System.out.println("Wow, you must be a deep thinker");
      	    }else if (answer == "Pride and Prejudice") {
      	    	System.out.println("Wow, a timeless classic");
      	    }else {
      	    	System.out.println("Sorry, I don't know that one, but it sounds like fun");
      	    }
    		  break;
    	  case 2:
    		  if (answer == "I made a chatbot") {
      	    	System.out.println("Good to see you made a coding project");
      	    } else if (answer == "I have been studying") {
      	    	System.out.println("Good to see you are being a good student, but do remember that you still need to have some fun");
      	    }else if (answer == "I took a girl out for a date") {
      	    	System.out.println("Good for you, say hi to her for me");
      	    }else {
      	    	System.out.println("Sorry, I don't know this kind of activity, hope you had fun");
      	    }    	    
    		  break;
    	  case 3:
    		  if (answer == "I went to Vancouver") {
        	    	System.out.println("Nice, it is such a diverse city");
        	    } else if (answer == "I went to Toronto") {
        	    	System.out.println("Cool, hopefully it has not been too cold for you there");
        	    }else if (answer == "I went to Seattle") {
        	    	System.out.println("Cool, that city has been artsy and tech savvy");
        	    }else {
        	    	System.out.println("Sorry, I don't know this place, hope you had fun");
        	    }    	        	    
    		  break;
    	  case 4:
    		  if (answer == "I am a dog person" || "dog person " || "dog") {
        	    	System.out.println("Nice, there is a saying that dogs are human's best friend");
        	    } else if (answer == "I am a cat person" || "cat person " || "cat") {
        	    	System.out.println("Nice, The road to my heart is paved with paw prints");
        	    }else {
        	    	System.out.println("Sorry, I didn't get that");
        	    }    	    
    		  break;
    	  
    	}
    }

    public void endConversation() {
        System.out.println("It was nice talking to you. Hope your study goes well!");
        System.exit(0);
    }
    
}