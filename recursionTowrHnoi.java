public class recursionTowrHnoi {
   static int total=3;
    public static void main(String[] args) {
    //    torOfHanoi(0, 0, 0, 0);  
              torOfHanoi('a','c','b',3);
            //  torOfHanoi("A", "B", 0, 0);
        

    }
    public static void torOfHanoi(char src,char des,char aux,int n){
       //base case
       if(n==0){
        return;
       }
       
        torOfHanoi(src,aux,des,n-1);
        System.out.println((total-n+1)+"disc move from"+src+"towr to"+des+"towr");
   torOfHanoi( aux,des, src,n-1);  //2nd faith


    }
    
}
