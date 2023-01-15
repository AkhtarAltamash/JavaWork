package demo;


abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base2 ka constructor hu:");
    }
    public void SayHello(){
        System.out.println("hello jee");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}
public class Lec53 {
    public static void main(String[] args) {
        Child2 c2=new Child2();
    }
}
