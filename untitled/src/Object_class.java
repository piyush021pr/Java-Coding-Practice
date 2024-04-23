class Student{
    int id;
    String name;
}
public class Object_class {
    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student();
        int n=s.id=10;
        String m=s.name="Alok";
        int n1=s1.id=11;
        String m1=s1.name="Vinod";


        System.out.println(n+" "+m);
        System.out.println(n1+" "+m1);
    }
}
