import java.util.Scanner;
public class Palindrome_number {
    public static void main(String[] args) {
        int rem,sum=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        temp=n;
        while(n>0){
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("The number "+temp+" is palindrome number");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
    }
}
