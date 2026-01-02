import java.util.Scanner;

public class Assistant {
    private User user;
    private CalmActivity ca;
    private MoodTracker mt;

    public Assistant(User user) {
        this.user = user;
        this.ca = new CalmActivity();
        this.mt = new MoodTracker();
    }

    public void startSession(Scanner sc) {
        String mood = mt.askMood(sc,user);
        System.out.println("Logging the mood: " + mood);
        user.addMoodHistory(mood); // This will now work correctly

        System.out.println("\nHere is a thought for you:");
        System.out.println("'" + QuoteProvider.getRandomQuote() + "'\n");

        System.out.print("Would you like to do a calming exercise? (yes/no): ");
        String ans = sc.nextLine().trim().toLowerCase();

        if (ans.equals("yes")) {
            ca.breathingExercise();
        }
        System.out.println("\nThank you for checking in with yourself!");
    }

    public void showMoodHistory() {
        System.out.println("\n--- Your Mood History ---");
        if (user.getMoodHistory().isEmpty()) {
            System.out.println("No moods have been logged yet.");
        } else {
            for (String mood : user.getMoodHistory()) {
                System.out.println("Logged Mood: " + mood);
            }
        }
        System.out.println("-------------------------\n");
    }
}