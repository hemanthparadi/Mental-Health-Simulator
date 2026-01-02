import java.util.Scanner;

public class Executer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hi, what is your name? ");
        String name = sc.nextLine();
        User user = new User(name);
        Assistant assistant = new Assistant(user);

        while (true) {
            System.out.println("\n*** Mental Health Check-in Menu ***");
            System.out.println("1. Start a New Check-in Session");
            System.out.println("2. Show My Mood History");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    assistant.startSession(sc);
                    break;
                case "2":
                    assistant.showMoodHistory();
                    break;
                case "3":
                    System.out.println("Thank you for using the simulator. Take care, " + user.getName() + "!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }
    }
}