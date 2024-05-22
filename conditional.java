import java.util.Scanner;

public class conditional {
public static void main(String[] args) {
  
Scanner input=new Scanner(System.in);
    /* 




    int age=19;
    if(age>=18){
        System.out.println("eligible for vote");
    }

else{
    System.out.println("not eligible for vote");
}







// check larger number b/w two numbres




Scanner input=new Scanner(System.in);
System.out.println("enter 1st num");
int num1=input.nextInt();
System.out.println("secand num is greter");
int num2=input.nextInt();
if(num1>num2){
    System.out.println("first number is greter");

}else{
    System.out.println("secand num is greter");
}






// check odd even 







System.out.println("enter num for check odd even");
int num=input.nextInt();
if(num%2==0){
    System.out.println("even num");
}else{
    System.out.println("odd num");
}








//income text calculator



System.out.println("enter your income for calculte the tex");
int num=input.nextInt();
if(num<500000){
    System.out.println("your tax is : tax=0");
}else if(num>50000  && num<1000000){
    System.out.println("your tax :"+(num*0.2));
}
else{
    System.out.println("your tax is   :"+(num*0.3));
}











//larger number b/w three numbrs


int a=1;
int b=4;
int c=6;
if(a>b && a>c){
    System.out.println("a ais greter");
}else if(b>c ){
   System.out.println("b is greter");
}else{
    System.out.println("c is greter");
}






// ternary oprator





int num=4;
String type=(num%2==0)? "even" :"odd";
System.out.println(type);

*/




System.out.println("enter marks");
int m=input.nextInt();
//int m;
String type=(m>=33)?"pass ":"fail";
System.out.println(type);
}

}