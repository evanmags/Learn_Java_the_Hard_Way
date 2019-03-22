import java.util.Scanner;

public class BMICalc{
  public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);
    double m, k, bmi, fTm, iTm, pTk, f, in;

    fTm = 0.3048;
    iTm = 0.0254;
    pTk =  2.205;

    System.out.print("What is your height in feet only? ");
    f = keyboard.nextDouble() * fTm;

    System.out.print("What is your height in inches only? ");
    in = keyboard.nextDouble() * iTm;
    m = f + in;

    System.out.print("What is your weight in pounds? ");
    k = keyboard.nextDouble() / pTk;

    bmi = k / (m * m);

    System.out.println("Your BMI is: " + bmi);

    keyboard.close();
  }
}