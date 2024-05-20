import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter num");
        int num=input.nextInt();
        //sum of digit


       /* 
        int i=0;
        int sum=0;
        for(i=0;i<=num;i++){
           sum=sum+i;

        }
        System.out.println(sum);
    



    //sum of odd num digit



         int i=0;
         int sum=0;
         for(i =0;i<=num;i++) {
            if(num%2!=0){
              sum=sum+i;  
            }
            else{
                System.out.println("even");
            }
            System.out.println("sum of odd num   :"+sum);


         } 
         
         */

         
        //print the table

         System.out.println("enter num for table printing");
         int i;
        int mul=1;
         for( i=1;i<=10;i++){
          mul=i*num;
          System.out.println(mul);

         }
    }
}
