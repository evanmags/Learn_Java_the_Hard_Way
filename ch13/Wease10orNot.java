import java.util.Scanner;

public class Wease10orNot{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    String word;
    boolean yep, nope;

    System.out.println("Typer the word \"wease1\" please: ");
    word = keyboard.next();
    keyboard.close();

    // either orientation will work
    yep = "wease1".equals(word);
    nope = ! "wease1".equals(word);

    System.out.println("You typed the requested word: " + yep);
    System.out.println("You ignored the instructions: " + nope);
  }
}