import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        int rem,temp,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        temp=n;
        while(n>0){
            rem=n%10;
            sum=(rem*rem*rem)+sum;
            n=n/10;
        }
        if(temp==sum){
            System.out.println(temp+" is armstrong number");
        }
        else{
            System.out.println("Not a armstrong number");
        }

    }
}
