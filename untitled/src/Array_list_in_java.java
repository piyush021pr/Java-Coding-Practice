import java.util.ArrayList;

public class Array_list_in_java {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        name.add("Piyush");
        name.add("Rishabh");
        name.add("Kunal");
        name.add("Manish");
        name.add("Sanchit");
        System.out.println("Elements in array List are:");
        for(String n:name){
            System.out.println(n);
        }
        String elementAtIndex1 = name.get(1);
        System.out.println("Element at index 1: " + elementAtIndex1);
        boolean namecontains=name.contains("Kunal");
        System.out.println("Does the name contain kunal "+namecontains);
        name.add(5,"Rohit");
        System.out.println(name);
        name.remove("Manish");
        System.out.println(name);
    }
}
