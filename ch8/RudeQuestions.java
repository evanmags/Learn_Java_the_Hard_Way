import java.util.Scanner;

public class RudeQuestions {
  public static void main (String[] args){
    String name, animal;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello, what is your name? ");
    name = keyboard.next(); // No spaces allowed!

    System.out.print("Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt(); // no floats or strings

    System.out.println("So you're " + age + " years old? That's not very old.");
    System.out.print("How much do you weigh " + name + "? ");
    weight = keyboard.nextDouble(); // no strings

    System.out.println(weight + "! You better keep that quiet!!");
    System.out.print("Finally, what is your income, " + name + "? ");
    income = keyboard.nextDouble(); // no strings

    System.out.print("Hopefully thats " + income + " per hour");
    System.out.println(" and not per year!");

    System.out.print("What is your favorite animal? ");
    animal = keyboard.next();

    System.out.print(animal + " awe, those are cute!");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name + ".");

    keyboard.close();
  }
}