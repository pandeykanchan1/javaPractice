import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n%3==0 && n%5!=0){
            System.out.println("fizz");

        }else if(n%5==0 && n%3!=0)
        { System.out.println("buzz");

        }else if(n%5==0 && n%2==0){
            System.out.println("bizz Buzz");

        }else{
            System.out.println(n);
        }
    }
}
