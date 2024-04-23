import java.util.Scanner;

public class Reverse_number_using_while_loop {
    public static void main(String[] args) {
        int rem,i,rev=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        System.out.println("The number before reverse is "+num);
        while(num!=0){
        rem=num%10;
        rev=(rev*10)+rem;
        num=num/10;
        }
        System.out.println("The number after reverse is "+rev);
    }
}
