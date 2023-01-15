package demo;
// DYNAMIC METHOD DISPATCH

class Phone{

    public void greet(){
        System.out.println("Good Morning");
    }

    public void name(){
        System.out.println("My name is JAVA");
    }
}
class SmartPhone extends Phone{
    public void Welcome(){
        System.out.println("khusamm deed");
    }

    public void name(){
        System.out.println("My name Is JAVA in class 2");
    }
}

public class Lec49 {
    public static void main(String[] args) {

//        Phone pho =new Phone();
//        SmartPhone spho =new SmartPhone();
//        pho.name();
//        spho.name();

        // DYNAMIC METHOD DISPATCH
        Phone ph =new SmartPhone(); // super class sa sub class ka object bana skta ha per sub sasuper nahi kr skta
        ph.greet();
        ph.name();

    }
}
