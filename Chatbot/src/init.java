import java.util.Scanner;

public class init {
    public static void main(String[] args) throws Exception {

        // Initializing a new chatbot
        Scanner sc = new Scanner(System.in);
        Chatbot bot = new Chatbot();
        boolean state = true;

        // Print hello message
        System.out.println("Hello there, I am a chatbot designed to help you learn English!\nLet's get started!");

        String question;
        String response;
        
        while (state) {
            //ask a random question
            question = bot.randomQuestion();
            response = sc.nextLine();

            bot.answerList(response, question);

            //end conversation
            if (response.toLowerCase().contains("end the conversation")) {
                state = false;
                bot.endConversation();

                sc.close();
            }
        }
    }
}
