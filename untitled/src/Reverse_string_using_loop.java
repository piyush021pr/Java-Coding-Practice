import java.util.Scanner;

public class Reverse_string_using_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String s=sc.nextLine();
        System.out.println("The original String is "+s);
        char ch[]=s.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
         rev=rev+ch[i];
        }
        System.out.println("The reverse String is "+rev);
    }
}
