import java.util.Scanner;

public class boolians {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    boolean a, b, c, d, e, f;
    double x, y;

    System.out.print("Give me two numbers, First: ");
    x = keyboard.nextDouble();
    System.out.print("Second: ");
    y = keyboard.nextDouble();
    keyboard.close();

    a = (x <  y);
    b = (x <= y);
    c = (x == y);
    d = (x != y);
    e = (x >  y);
    f = (x >= y);

    System.out.println(x + " IS LESS THAN " + y + ": " + a);
    System.out.println(x + " IS LESS THAN/EQUAL TO " + y + ":" + b);
    System.out.println(x + " IS EQUAL TO " + y + ":  " + c);
    System.out.println(x + " IS NOT EQUAL TO " + y + ": " + d);
    System.out.println(x + " IS GREATER THAN " + y + ": " + e);
    System.out.println(x + " IS GREATER THAN/EQUAL TO " + y + ": " + f);
    System.out.println();

    System.out.println(!(x <  y) + " " + (x <= y));
    System.out.println(!(x <=  y) + " " + (x < y));
    System.out.println(!(x ==  y) + " " + (x != y));
    System.out.println(!(x !=  y) + " " + (x == y));
    System.out.println(!(x >  y) + " " + (x >= y));
    System.out.println(!(x >=  y) + " " + (x > y));

    // Less than: <
    // Less than or Equal to: <=
    // Greater than: >
    // Greater than or Equal to: >=
    // Equal to: ==
    // Not equal to: !=
  }
}