public class CreatingVariables{
  public static void main(String[] args){
    int x, y, age, myint;
    double seconds, e, checking, mydouble;
    String firstName, lastName, title, mystr1, mystr2;

    x = 10;
    y = 400;
    age = 39;
    myint = 3;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    mydouble = 3.1415926;

    firstName = "Evan";
    lastName = "Magnussen";
    title = "Mr.";
    mystr1 = "My favorite integer is: ";
    mystr2 = "My favorite float is: ";

    System.out.println("Variable x contains: " + x);
    System.out.println("The value " + y + " is stored in variable y.");
    System.out.println("The experiment took " + seconds + " seconds.");
    System.out.println("My favorite irrational # is Euler's number " + e);
    System.out.println("Hopefully you have more money than $" + checking + "!");
    System.out.println("My name is " + title + firstName + " " + lastName);
    System.out.println(mystr1 + myint);
    System.out.println(mystr2 + mydouble);
  }
}