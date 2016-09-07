import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter a word to calculate your scrabble score!");
    String userWord = console.readLine();

    Scrabble scrabble = new Scrabble();
    Integer userWordScore = scrabble.calculateScore(userWord);

    System.out.println("Your total score is " + userWordScore);
  }
}
