import static java.lang.System.*;
import java.util.Scanner;

public class CoinFlip{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    String coin, again;
    int streak = 0;
    boolean gotHeads;

    do {
      gotHeads = Math.random() < 0.5;

      if(gotHeads)
        coin = "HEADS";
      else
        coin = "TAILS";

      out.println("You flip a coin and it is... " + coin);

      if (gotHeads){
        streak++;
        out.println("\tThat's " + streak + " in a row....");
        out.println("Would you like to flip again (y/n)?");
        again = keyboard.next();
      }
      else {
        out.println("\tYou lose everything!");
        out.println("\tShould've quit while you were aHEAD....");
        streak = 0;
        again = "n";
      }
    } while (again.equals("y"));
    keyboard.close();
    out.println("Final Score: " + streak);
  }
}