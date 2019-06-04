import java.util.Scanner;

public class PigDice{
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    int roll, ptot, ctot, turnTotal;
    String choice = "";

    ptot = 0;
    ctot = 0;

    do {
      turnTotal = 0;
      System.out.println("You have " + ptot + " points.");

      do {
        roll = 1 + (int)(Math.random()*6);
        System.out.println("\tYou have rolled a " + roll);
        if (roll == 1){
          System.out.println("\tThat ends your turn");
          turnTotal = 0;
        }
        else {
          turnTotal += roll;
          System.out.println("\tYou have " + turnTotal + " points so far this round.\n");
          System.out.print("\tWould you like to \"roll\" again or \"hold\"? ");
          choice = keyboard.next();
        }

      } while (roll != 1 && choice.equals("roll"));

      ptot += turnTotal;
      System.out.println("\tYou end the round with " + ptot + " points");

      if (ptot < 100){
        turnTotal = 0;
        System.out.println("Computer has " + ctot + " points.");
        do{
          roll = 1 + (int)(Math.random()*6);
          System.out.println("\tComputer rolled a " + roll);
          if (roll == 1){
            System.out.println("\tThat ends its turn");
            turnTotal = 0;
          }
          else {
            turnTotal += roll;
            System.out.println("\tThe computer has " + turnTotal + " points so far this round.\n");
            if (turnTotal < 20 && ctot + turnTotal < 100){
              System.out.println("\tThe computer will roll again.");
            }
          }

        } while (roll != 1 && turnTotal < 20 && ctot + turnTotal < 100);
          
        ctot += turnTotal;
        System.out.println("\tComputer ends the round with " + ctot + " points.");

      }

    } while (ptot < 100 && ctot < 100);
    keyboard.close();

    if (ptot > ctot){
      System.out.println("Humanity Wins!");
    }
    else {
      System.out.println("The Computer wins");
    }
  }
}