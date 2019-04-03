import static java.lang.System.*;
import java.util.Scanner;

public class SafeSquareRoot{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double x, y;

    do {
      out.println("Are you ready?!");
    } while(!keyboard.next().equals("yes"));

    out.print("Give me a number, I'll find it's square root. ");
    out.print("(No negatives, please!) ");
    x = keyboard.nextDouble();

    while (x < 0 ){
      out.println("I won't take the square root of a negative");
      out.print("\nNew number: ");
      x = keyboard.nextDouble();
    }
    keyboard.close();

    y = Math.sqrt(x);

    out.println("The square root of " + x + " is " + y);
  }
}