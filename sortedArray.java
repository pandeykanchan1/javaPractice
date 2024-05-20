public class sortedArray {
    public static void main(String[] args) {
        System.out.println("welcome to array sorting checkpost");
       int[] numbers=arrayUtility.inputArray();
    boolean isIns=isINcresing(numbers);
    boolean isDec=isDecresing(numbers);
      

    if(isIns || isDec){
        System.out.println("your array is sorted");
    }
   else{
    System.out.println("your array is not sorted");
   }
}



    public static boolean isINcresing(int[] numbers){
        int index=1;
        while(index<numbers.length){
            if(numbers[index]<numbers[index-1]){
               return false;
            }
            index++;
        }
        return true;
    }


    public static boolean isDecresing(int[] numbers){
        int index=1;
        while(index<numbers.length){
            if(numbers[index]>numbers[index-1]){
               return false;
            }
            index++;
        }
       
        return true;
    }

}
