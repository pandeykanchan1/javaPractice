public class mergeTwoSoertedARR {
    public static void main(String[] args) {
        int arr1[]={1,2,4,6,7,9};
        int arr2[]={2,10,12,15};
        //int m=arr1.length;
       // int n=arr2.length;
       int res[]=mergeTwoSortedArr(arr1, arr2);
       for(int i=0;i<res.length;i++){
        System.out.println(res[i]+" ");
       }

    }
    public static int[] mergeTwoSortedArr(int arr1[],int arr2[]){
       int m=arr1.length;
       int n=arr2.length;
          int res[]=new int[m+n];
          int i=0;
          int j=0;
          int k=0;
          while (arr1[i]<m && arr2[j]<n) {
            if(arr1[i]<arr2[j]){
                res[k]=arr1[i];
                i++;
             //   k++;

            }else{
                res[k]=arr2[j];
                j++;
            }
            k++;
            
          }while(i<n){
            res[k]=arr1[i];
            i++;
            k++;
          }
          while (j<m) {
            res[k]=arr2[j];
            j++;
            k++;
            
          }
          return res;

    }
}
