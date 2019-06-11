public class YachtDice{
  public static void main( String[] args ){
    int[] dice = new int[5];
    boolean allSame;

    do {
      for (int i = 0; i < dice.length; i++){
        dice[i] = 1 + (int)(Math.random() * 6);
      }
      
      System.out.print("\nYou rolled: " + dice[0] + " " + dice[1] + " ");
      System.out.println(dice[2] + " " + dice[3] + " " + dice[4]);

      for (int i = 0; i < dice.length; i++){
        showDice(dice[i]);
      }

      allSame = (dice[0] == dice[1] && 
                 dice[1] == dice[2] && 
                 dice[2] == dice[3] && 
                 dice[3] == dice[4]);

    } while (!allSame);

    System.out.println("The Yacht!!");
  }

  public static void showDice( int roll ){
    border();
    if(roll == 1){
      blank();
      center();
      blank();
    }
    if(roll == 2){
      left();
      blank();
      right();
    }
    if(roll == 3){
      left();
      center();
      right();
    }
    if(roll == 4){
      outside();
      blank();
      outside();
    }
    if(roll == 5){
      outside();
      center();
      outside();
    }
    if(roll == 6){
      for (int x = 0; x < 3; x++){
        outside();
      }
    }
    border();
  }

  public static void border(){
    System.out.println("+---+");
  }
  public static void blank(){
    System.out.println("|   |");
  }
  public static void left(){
    System.out.println("|o  |");
  }
  public static void center(){
    System.out.println("| o |");
  }
  public static void right(){
    System.out.println("|  o|");
  }
  public static void outside(){
    System.out.println("|o o|");
  }
}