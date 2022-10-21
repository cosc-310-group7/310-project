# 310-project
This system is meant as a chatbo that helps people learn english, it will ask the users questions and expects the users to understand and answer the questions.

Our chatbot code contains two folders Chatbot, init:
Chatbot: contains all the methods used to ask and check the answers from the user
init: used to initialize the chatbot 

Chatbot Methods:

Chatbot(): This method contains all the questions the users will be asked

randomQuestion(): this method returns an unasked question to the users and if all questions arr returns "Oops, I ran out of questions!"

answerList(): this method takes every question and provides a set of valid answers to the question, and if the answer is not in the set of answers it tells the user the it doesn't know.

endConversation(): Closes the session and prints a goodbye message
