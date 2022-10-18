import java.util.Scanner;

import java.io.*;
import java.util.*;

public class init {
    public static void main(String[] args) throws Exception {

        // Initializing a new chatbot
        Scanner sc = new Scanner(System.in);
        Chatbot bot = new Chatbot();

        Boolean state = true;

        while (state == true) {

            //ask a random question
            bot.randomQuestion();
            String response = sc.nextLine();

            //end conversation
            if (bot.checkState(response) == false) {
                bot.endConversation();
                state = false;
                sc.close();
                break;
            }
        }
    }
}
