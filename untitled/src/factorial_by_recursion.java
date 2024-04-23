import java.util.Scanner;
public class factorial_by_recursion {
    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter any positive number");
        int n=sc.nextInt();
        int res=factorial(n);
        System.out.println("The factorial of number is "+res);
    }
}
