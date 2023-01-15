package demo;


class Circle{
    public int Radius;
    Circle(){
        System.out.println(" I am Non parameterized constructor of circle");
    }

    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.Radius=r;
    }


    public double Area(){
        return Math.PI*this.Radius*this.Radius;
    }

}
class Cylinder1 extends Circle{
    public int Radius;
    Cylinder1(int r,int h){

        super(r);
        System.out.println(" I am Cylinder constructor:");
        this.height=h;
    }
    public int height;
    public  double volume(){
        return Math.PI*this.Radius*this.Radius*this.height;
    }
}


public class Lec52 {
    public static void main(String[] args) {

// PROBLEM 1
//        Circle objc = new Circle(12);
        Cylinder1 obj =new Cylinder1(12,4);
    }
}
