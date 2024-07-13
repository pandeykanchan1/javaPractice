public class pivotPrtisionQuickSort {
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quickSort(arr, 0,arr.length-1);
        prntArr(arr);
    }
    
    
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        //last elmt =piviot
     int pidx=partision(arr, si, ei);
     quickSort(arr, si, pidx-1);   //left prt
     quickSort(arr, pidx+1, ei);

    }
    public static int partision(int arr[],int si,int ei){
              int pivot=arr[ei];
              int i=si-1;   //to make place for els smaller than pivot
       
             for(int j=si;j<ei;j++){
                if(arr[j]<=pivot){
                   i++;
                   //swap
                   int temp=arr[j];
                   arr[j]=arr[i];
                   arr[i]=temp;
                }

                }
              i++;
              int temp=pivot;
              arr[ei]=arr[i];
              arr[i]=temp;
           return i;
             }
             //return i;
            
            

            
            public static void prntArr(int arr[]){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
}
