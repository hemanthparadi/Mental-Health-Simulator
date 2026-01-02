import java.util.Scanner;

public class MoodTracker {
    public String askMood(Scanner sc,User user) {
        System.out.println("Hi "+user.getName()+", how are you feeling today?");
        System.out.println("Options: Happy, Sad, Anxious, Angry, Tired");
        System.out.print("Your mood? ");
        String mood = sc.nextLine();
        return mood;
    }
}