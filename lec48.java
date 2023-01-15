package demo;


class A {
    public int a;

    public int harry() {
        return 4;
    }

    public void meth2() {
        System.out.println("I am Method 2 of Class A");
    }
}

class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am Method 2 of Class B");
    }
        public void meth3(){
            System.out.println("I am Method 3 of Class B");
        }
    }

public class lec48 {
    public static void main(String[] args) {
        // method overriding

        A a =new A();
        a.meth2();

        B b=new B();
        b.meth2();



    }
}
