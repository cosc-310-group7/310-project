import java.util.Scanner;

public class init {
    public static void main(String[] args) throws Exception {

        // Initializing a new chatbot
        Scanner sc = new Scanner(System.in);
        Chatbot bot = new Chatbot();
        boolean state = true;

        // Print hello message
        System.out.println("Hello there, I am a chatbot designed to help you learn English!\nLet's get started!");

        while (state) {
            //ask a random question
            bot.randomQuestion();
            String response = sc.nextLine();

            //end conversation
            if (response.toLowerCase().contains("end the conversation")) {
                state = false;
                sc.close();
                bot.endConversation();
            }
        }
    }
}
