import java.util.Scanner;

public class Palindrome_number1 {
    public static void main(String[] args) {
        int temp,rem,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        temp=n;
        while(n>0){
          rem=n%10;
          sum=(sum*10)+rem;
          n=n/10;
        }
      if(temp==sum){
    System.out.println(temp+" is a palindrome number");
}
      else{
          System.out.println("Not a palindrome number");
      }
    }
}
