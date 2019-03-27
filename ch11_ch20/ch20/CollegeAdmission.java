import static java.lang.System.*;
import java.util.Scanner;

public class CollegeAdmission{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int math;

    out.println("Welcome to the UT Austin College Admission Interface!");
    out.print("Please enter your SAT math score (200 - 800): ");
    math = keyboard.nextInt();
    keyboard.close();

    out.print("Admission status: ");

    if(math >= 790)
      out.print("CERTAIN");
    else if(math >= 710)
      out.print("SAFE");
    else if(math >= 580)
      out.print("PROBABLE");
    else if(math >= 500)
      out.print("UNCERTAIN");
    else if(math >= 390)
      out.print("UNLIKELY");
    else
      out.print("DENIED");
    out.println();
  }
}