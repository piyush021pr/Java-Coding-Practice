import java.util.Scanner;

public class Even_odd_using_ternary_operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        String output=(num%2==0)?"Even number":"Odd number";
        System.out.println(output);
    }
}
