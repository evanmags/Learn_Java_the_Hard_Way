import java.util.Scanner;

public class BMIcategories{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double bmi, h, w;

    System.out.print("Enter your Height (m): ");
    h = keyboard.nextDouble();

    System.out.print("Enter your Weight (kg): ");
    w = keyboard.nextDouble();
    keyboard.close();

    bmi = (w / (h * h));

    System.out.print("BMI category, for BMI: " + bmi + ": ");
    if(bmi < 15.0){
      System.out.println("Very severly underweight.");
    }
    else if(bmi <= 16.0){
      System.out.println("Severly underweight.");
    }
    else if(bmi < 18.5){
      System.out.println("Underweight.");
    }
    else if(bmi < 25.0){
      System.out.println("Normal weight.");
    }
    else if(bmi < 30.0){
      System.out.println("Overweight.");
    }
    else if(bmi < 35.0){
      System.out.println("Moderately obese.");
    }
    else if(bmi < 40.0){
      System.out.println("Severly obese.");
    }
    else {
      System.out.println("Very severly/\'morbidly\' obese.");
    }
  }
}