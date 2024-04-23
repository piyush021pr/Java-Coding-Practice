import java.util.Scanner;
public class Swapping_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int temp=0;
        System.out.println("The number before swapping is "+a+" and "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("The number after swapping is "+a+" and "+b);
    }
}
