import static java.lang.System.*;
import java.util.Scanner;

public class EnterPin{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String password, pass;

    pin = 12345;
    pass= "PassWord";

    out.println("WELCOME TO THE BANK OF JAVA.");
    out.print("ENTER YOUR PASSWORD: ");
    password = keyboard.next();
    
    while(! pass.equals(password)){
      out.println("\nINCORRECT PASSWORD. TRY AGAIN");
      out.print("ENTER YOUR PASSWORD: ");
      password = keyboard.next();
    }
    
    out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while(entry != pin){
      out.println("\nINCORRECT PIN. TRY AGAIN");
      out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    keyboard.close();
    out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}