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
    	
    	switch (qursionsIndex) {
    	  case 0:
    		  if (answer == "facebook") {
    	    	System.out.println("I am asking my good ol' robot pal Zuck to send me some your private datas");
    	    } else if (answer == "instagram") {
    	    	System.out.println("So you are a stalking grils in your class, creep.");
    	    }else if (answer == "tiktok") {
    	    	System.out.println("Gen Zs need help, back in my days, people are brave enough to just drag ppl out of cars instead of asking them what do you do for a living ");
    	    }else if (answer == "snapchat") {
    	    	System.out.println("not a dic pic pass platform, she might screenshot that");
    	    }else {
    	    	System.out.println("Use what others are using, otherwise you are lame");
    	    }
    	    break;
    	  case 1:
    		  if (answer == "Harry Potter") {
      	    	System.out.println("not bad kiddo");
      	    } else if (answer == "1984") {
      	    	System.out.println("political freak");
      	    }else if (answer == "fifty shades of grey") {
      	    	System.out.println("best book ever, says the creep");
      	    }else if (answer == "Pride and Prejudice") {
      	    	System.out.println("well, I am prideful when compared to yall humans");
      	    }else {
      	    	System.out.println("Read what others are Reading, otherwise you are lame");
      	    }
    		  break;
    	  case 2:
    		  if (answer == "I made a chatbot") {
      	    	System.out.println("Good to see you are surrendering to the mighty digital universe");
      	    } else if (answer == "I have been studying") {
      	    	System.out.println("all work no play makes jack a dull boy");
      	    }else if (answer == "I took a girl out for a date") {
      	    	System.out.println("who is the unlucky lady?");
      	    }else {
      	    	System.out.println("Sounds Boring, go do something fun");
      	    }    	    
    		  break;
    	  case 3:
    		  if (answer == "I went to Vancouver") {
        	    	System.out.println("Nice, I recommend east hastings, so much fun");
        	    } else if (answer == "I went to Toronto") {
        	    	System.out.println("I turn the 6 upside down, it is a 9 now. Did you see Drake?");
        	    }else if (answer == "I went to Thailand") {
        	    	System.out.println("Hungover Part 2 style? ");
        	    }else {
        	    	System.out.println("Sounds Boring, go somewhere fun");
        	    }    	        	    
    		  break;
    	  case 4:
    		  if (answer == "I am a dog person" || "dog person " || "dog") {
        	    	System.out.println("Cats are better");
        	    } else if (answer == "I am a cat person" || "cat person " || "cat") {
        	    	System.out.println("Ha, humans have kneeled for the cat god, should have picked dog to save yourselves from slavery");
        	    }else {
        	    	System.out.println("o I see, you hate animals");
        	    }    	    
    		  break;
    	  
    	}
    }

    public void endConversation() {
        System.out.println("It was nice talking to you. Hope your study goes well!");
        System.exit(0);
    }
    
}