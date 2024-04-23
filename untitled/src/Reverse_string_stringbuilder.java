import java.util.Scanner;

public class Reverse_string_stringbuilder {
    public static String reverse(String str){
        StringBuilder sc=new StringBuilder(str);
        sc.reverse();
        return sc.toString();
    }
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string");
        String str=sc.nextLine();
        System.out.println("The original String is "+str);
        String res=reverse(str);
        System.out.println("The String after reverse is "+res);


    }
}
