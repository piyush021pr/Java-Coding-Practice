import org.w3c.dom.ls.LSOutput;

class Bike{
    Bike(){
        System.out.println("This is a Bike");
    }
    Bike(int a){
        System.out.println("I am a "+a+" number");
    }

}
public class Constructor {
    public static void main(String[] args) {
        Bike b=new Bike(6);
    }
}
