import java.util.Scanner;
public class arrayUtility {
    public static int[] inputArray() {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=input.nextInt();
        int[] nums=new int [size];
        int i=0;
        while(i<size){
            System.out.println("please enter no "+(i+1));
            nums[i]=input.nextInt();
            i++;  
        }
        return nums;

    }

    public static void displayArray(int[] nums){
        int i=0;
        while(i<nums.length){
            System.out.println(nums[i] + "  "  );
            i++;
        }
        System.out.println();

    }
}
