import java.util.Scanner;

public class Positive_Negative_Zero_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        if(n<0){
            System.out.println(n+" is a negative number");
        }
        else if(n>0){
            System.out.println(n+" is a positive number");
        }
        else {
            System.out.println(n+" is equal to zero");
        }
    }
}
