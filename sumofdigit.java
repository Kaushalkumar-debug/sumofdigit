import java.util.Scanner;
public class sumofdigit {
   public static void main(String[]args){
    int n;
    System.out.println("enter sum of digit");
    Scanner r=new Scanner(System.in);
     n=r.nextInt();
    int num=0;
    while(n>0){
 num+=n%10;
 n=n/10;
   } 
   System.out.println("sum of digit is:"+n+"="+num);
}
}
