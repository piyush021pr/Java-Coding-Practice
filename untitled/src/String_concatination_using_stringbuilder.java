public class String_concatination_using_stringbuilder {
    public static void main(String[] args) {
        StringBuilder s1=new StringBuilder("Pankaj ");
        StringBuilder s2=new StringBuilder("Goyal");
        StringBuilder s3=s1.append(s2);
        System.out.println(s3);
    }
}
