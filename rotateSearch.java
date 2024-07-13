public class rotateSearch {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int tar=0;    //output 4
        System.out.println(search(arr, tar, 0, arr.length-1));
    }
    public static int search(int arr[],int tar,int si,int ei)
    {
        if(si>ei){
            return -1;
        }
        //kaam
      int mid =si+(ei-si)/2;//   int mid=si+ei/2;
        //case
        if(arr[mid]==tar){
            return mid;
        }
        //min on l1

        if(arr[si]<=arr[mid]){
     //case a left
     if(arr[si]<=tar && tar<=arr[mid] ){
      return  search(arr, tar, si, mid-1);
     }else{
        //case b right
       return  search(arr, tar, mid+1, ei);
     }
        }
        //mid on l2
        else{
            //case c right
            if(arr[mid]<= tar && tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
            }else{
                //case d: left
                return search(arr, tar, si, mid-1);
            }
        }

    }
} 
//time complexity n long n
