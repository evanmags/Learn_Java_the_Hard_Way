import java.util.Scanner;

public class SecretWord{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    String secret = "please", guess;

    System.out.print("What is the secret word? ");
    guess = keyboard.next();
    keyboard.close();

    if(guess.equals(secret) || guess.equals("yesterday")){
      System.out.println("That's correct!");
    }
    else {
      System.out.println("No, the secret word isn't \"" + guess + "\".");
    }

    // strings are not equal on a shallow comparison.
    if(secret == guess) {
      System.out.println("This will never, EVER, show. No matter what.");
    }
  }
}