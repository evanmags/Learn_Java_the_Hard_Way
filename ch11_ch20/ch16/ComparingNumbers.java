import java.util.Scanner;

public class ComparingNumbers{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.println("Give me two numbers, first: ");
    first = keyboard.nextDouble();

    System.out.println("Second: ");
    second = keyboard.nextDouble();
    keyboard.close();

    if(first < second)
      System.out.println( first + " is LESS THAN " + second);
    
    if(first <= second)
      System.out.println( first + " is LESS THAN/EQUAL TO " + second);
    
    if(first == second)
      System.out.println( first + " is EQUAL TO " + second);
    
    if(first > second)
      System.out.println( first + " is GREATER THAN " + second);
    
    if(first >= second)
      System.out.println( first + " is GREATER THAN/EQUAL TO " + second);
    
    if(first != second){
      System.out.println( first + " is NOT EQUAL TO " + second);
      System.out.println("hey!");
    }
  }
}