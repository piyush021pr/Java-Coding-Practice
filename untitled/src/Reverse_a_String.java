import java.util.Scanner;

public class Reverse_a_String {
    public static void main(String[] args) {
        String reverse=" ";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println("The original string is "+str);
        for(int i=0;i<str.length();i++){
            reverse=str.charAt(i)+reverse;
        }
        System.out.println("Reverse String is "+reverse);
    }
}
