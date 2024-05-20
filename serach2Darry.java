import java.util.Scanner;

public class serach2Darry {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);

        System.out.println("welcome to search in 2d array");
       int[][] numarr=arrayUtility.input2DArray();
         
       System.out.println("enter num that you want to search");
       int num=input.nextInt();
       boolean isfound=search(numarr,num);
    if(isfound){
        System.out.println("your element is found");
    }else{
        System.out.println("your num is not found");

    }

    }

    public static boolean search(int[][]  numarr,int num){
        int i=0;
        while(i<numarr.length){
            int j=0;
            while(j<numarr[i].length){
                if(numarr[i][j]==num){
                   return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
