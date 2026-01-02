import java.util.Random;

public class QuoteProvider {
    private static String[] quotes = {
        "You are stronger than you think.",
        "Take it one step at a time.",
        "This too shall pass.",
        "Breathe, you're doing okay.",
    };

    public static String getRandomQuote() {
        Random rand = new Random();
        return quotes[rand.nextInt(quotes.length)];
    }
}