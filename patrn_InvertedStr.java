public class patrn_InvertedStr {
    public static void main(String[] args) {
        

//pattern 
/*
 *****
 ****
 ***
 **
 *
 */


        for(int line=1;line<=4;line++){
            for(int str=4;str>=line;str--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
