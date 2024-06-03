public class pattrns {
    public static void main(String[] args) {

      // pattrn(5);
     //  System.out.println();
     //  System.out.println();
     //buttrflyy(5);
     //pattrnn3(5);
     //pattrn5(5);
     //pattrnnn(5);
     floyd(5);

    }
    //             *
//                **
   //            ***
//             *****
//            ******   
    public static void pattrn(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*n-i;j++){
                System.out.print(" ");
            }


            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }



    }



    //butterfly pattrn



    public static void buttrflyy(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }for(int j=1;j<2*(n-i);j++){
                System.out.print(" ");
            }for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

            //2nd half


        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }for(int j=1;j<2*(n-i);j++){
                System.out.print(" ");
            }for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();


        }

        //pyramid
        
    }
    public static void pattrnn3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print( " ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //pattrn

    public static void pattrn5(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*
         
         */
    }



//pattern
    
    /*  
     1
     2 2
     3 3 3
     4 4 4  4
     5 5 5 5 5 5 

      
     
     
    */
    public static void pattrnnn(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
              System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    /*
     1
     2 3
     4 5 6
     7 8 9 10
     11 12 13 14 15

     */
    public static void floyd(int n){
      int   count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

}

