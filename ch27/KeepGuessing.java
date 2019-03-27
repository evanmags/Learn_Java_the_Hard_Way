import static java.lang.System.*;
import java.util.Scanner;

public class KeepGuessing{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int secret, guess;

    secret = 1 + (int)(Math.random() * 10);

    out.println("I have chozen a number between 1 and 10");
    out.println("Try to guess it!");
    out.print("Your guess: ");

    guess = keyboard.nextInt();

    while(secret != guess){
      out.println("That is incorrect. Guess again");
      out.print("Your guess: ");
      guess = keyboard.nextInt();
    }

    keyboard.close();

    out.println("You're right! You're a good guesser.");
  }
}