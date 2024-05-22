import java.util.Scanner;

public class switchh {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter num ");
        int num=input.nextInt();
        switch (num) {
            case 1:System.out.println("smosa");
                 break;
            case 2:System.out.println("jilebi");
                 break;
            case 3 :System.out.println("gulab jamun");
                 break;
            default:System.out.println("no one is match");
                break;
        }
        
    }
}