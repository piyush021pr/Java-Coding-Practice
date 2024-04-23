import java.util.Scanner;

public class methods_in_java {
    public static int minfunction(int n,int m){
        int min;
        if(n<m){
            min=n;
        }
        else{
            min=m;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int n=sc.nextInt();
        System.out.println("Enter second number");
        int m=sc.nextInt();
        int c=minfunction(n,m);
        System.out.println("The min value is "+c);
    }
}
