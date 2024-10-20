import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//  *REPLACE THIS WHOLE LINE WITH A GREETING TO THE USER AND WELCOMING THEM AND DECLARE A SCANNER
        //hi, life is kinda crazy sometimes and we could all use some kind words every once in a while
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi there, life is kinda crazy sometimes and we could all use kind words every once in a while. What's your name?");
        String name = sc.nextLine();

        System.out.println("Nice to meet you " + name + ", I know there might be many ways to describe how you're feeling right now but try condensing it to one of these: happy, angry, sad, anxious, scared, excited, good, or bad?");
        String feeling = sc.nextLine();

        System.out.println("And lastly, do you want to be comforted or pushed?");
        String messageType = sc.nextLine();

        Message userInfo = new Message(name, feeling, messageType);
        userInfo.getKindWords();


        /*private static String getMessageType(name) {
            System.out.println("Hi there, life is kinda crazy sometimes and we could all use some kinda words every once in a while. What's your name?");
            String name = sc.nextLine();
        }
        private static String getUsersFeeling() {
            System.out.println("I know there might be many ways to describe how you're feeling right now but type the word which best describes the feeling: happy, angry, sad, anxious, scared, excited, good, or bad");
            String userFeeling = sc.nextLine();

        }




        // *then ask them to choose(TYPE) from a list of emotions angry, happy, sad, anxious, scared, good, bad*


        // *then ask them if they want to be pushed or if they want to be comforted*



        //REMEMBER TO TAKE THEIR ANSWER TO EACH OF THESE QUESTIONS AND STORE THEM BY DECLARING A STRING = TO THEIR ANSWER*/
    }
}