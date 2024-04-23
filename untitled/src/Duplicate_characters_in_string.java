import java.util.Scanner;

public class Duplicate_characters_in_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any word");
        String str=sc.nextLine();
        char [] ch=str.toCharArray();
        System.out.println("The original stringt is "+str);
        System.out.print("The duplicate characters in array");
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(ch[i]==ch[j]){
                    System.out.print(" "+ch[j]);
                    break;
                }
            }
        }

    }
}
