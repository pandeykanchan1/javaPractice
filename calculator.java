import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 1st num");
        int a=input.nextInt();
        System.out.println("enter 2nd number");
        int b=input.nextInt();
        System.out.println("enter oprator");

        char op=input.next().charAt(0);
        switch (op) {
            case '+': System.out.println(a+b);
                 break;
            case '-':System.out.println(a-b);
                break;
            case '*':System.out.println("multiply  :"+a*b);
          //  default:
                break;
            case '/':System.out.println("devide :"+a/b);
              break;
           case '%':System.out.println("modulus is :"+a%b);
            default :System.out.println("no opration will perform");
        }
    }
}
