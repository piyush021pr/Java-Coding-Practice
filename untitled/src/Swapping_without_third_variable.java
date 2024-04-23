import java.util.Scanner;

public class Swapping_without_third_variable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("The number before swapping is "+a+" and "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The number after swapping is "+a+" and "+b);
    }
}
