import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner input=  new Scanner(System.in);
        System.out.println("ENTER 1st num for swap");
      int First=  input.nextInt();
        System.out.println("enter 2nd number");
      int Secand=  input.nextInt();
      int c;
      c=First;
      First=Secand;
      Secand=c;
    
      System.out.println("value of first and Secand:  "+First );
      System.out.println("value of Secan is:"  +Secand);
    }
}
