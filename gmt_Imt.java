import java.util.Scanner;

public class gmt_Imt {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter day");
        int d=input.nextInt();
        System.out.println("enter hour");
        int h=input.nextInt();
        System.out.println("enter minut");
        int m=input.nextInt();


        //GMT = IST
        h +=5;
        m +=30;

        if(m>=60){
            h++;
            m=m-60;
        }
        if(h>=24){
            d++;
            h=h-24;
        }
        System.out.println("day :"+d+"hour"+ h +"minut:"+m );
    }
}
