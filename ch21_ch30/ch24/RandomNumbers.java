import static java.lang.System.*;

public class RandomNumbers{
  public static void main(String[] args){
    int a, b, c, d;
    double r, rps;

    rps = Math.random();
    if (rps < 0.3333333 ) {
      out.println("ROCK");
    }
    else if (rps < 0.6666667) {
      out.println("PAPER");
    }
    else {
      out.println("SCISSORS");
    }

    // pick 4 random integers from 1 to 10
    a = 1 + (int)(10 * Math.random());
    b = 1 + (int)(10 * Math.random());
    c = 1 + (int)(10 * Math.random());
    d = 1 + (int)(10 * Math.random());
    out.println("1-10:\t" + a + "\t" + b + "\t" + c + "\t" + d );

    // pick 4 random integers from 1 to 6
    a = 1 + (int)(6 * Math.random());
    b = 1 + (int)(6 * Math.random());
    c = 1 + (int)(6 * Math.random());
    d = 1 + (int)(6 * Math.random());
    out.println("1-6:\t" + a + "\t" + b + "\t" + c + "\t" + d );

    // pick 4 random integers from 1 to 6
    a = 1 + (int)(6 * Math.random());
    b = 1 + (int)(6 * Math.random());
    c = 1 + (int)(6 * Math.random());
    d = 1 + (int)(6 * Math.random());
    out.println("1-6:\t" + a + "\t" + b + "\t" + c + "\t" + d );
    
    // pick a single random integer from 1 to 100
    a = 1 + (int)(100 * Math.random());
    out.println("1-100:\t" + a + "\t" + a + "\t" + a + "\t" + a );

    // pick 4 random integers from 1 to 100
    a = 1 + (int)(100 * Math.random());
    b = 1 + (int)(100 * Math.random());
    c = 1 + (int)(100 * Math.random());
    d = 1 + (int)(100 * Math.random());
    out.println("1-100:\t" + a + "\t" + b + "\t" + c + "\t" + d );

    // pick 4 random integers from 0 to 99
    a = 0 + (int)(100 * Math.random());
    b = 0 + (int)(100 * Math.random());
    c = (int)(100 * Math.random());
    d = (int)(100 * Math.random());
    out.println("0-99:\t" + a + "\t" + b + "\t" + c + "\t" + d );

    // pick 4 random integers from 10 to 20
    a = 10 + (int)(11 * Math.random());
    b = 10 + (int)(11 * Math.random());
    c = 10 + (int)(11 * Math.random());
    d = 10 + (int)(11 * Math.random());
    out.println("10-20:\t" + a + "\t" + b + "\t" + c + "\t" + d );

    // display random doubles each [0 - 1)
    out.println("0-1:\t" + Math.random() + "\t" + Math.random());
    out.println("0-1:\t" + Math.random() + "\t" + Math.random());
  
    r = Math.random();
    out.println("0-9.99:\t" + r);
    out.println("0-9:\t" + (int)r);
    out.println("1-10:\t" + (1 + (int)r));

    a = 1 + (int)(2 * Math.random());
    b = 1 + (int)(2 * Math.random());
    c = 1 + (int)(2 * Math.random());
    out.println("0-1:\t" + a + "\t" + b + "\t" + c);

    a = 5 + (int)(5 * Math.random());
    b = 5 + (int)(5 * Math.random());
    c = 5 + (int)(5 * Math.random());
    out.println("0-1:\t" + a + "\t" + b + "\t" + c);
  }
}