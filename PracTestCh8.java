package demo;

class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}

        class Cellphone{
    public void Ringing(){
        System.out.println("Ringing ......");
    }
    public void vibrating(){
        System.out.println("Vibrating .........");
    }
    public void calling(){
        System.out.println("calling ..........");
    }
        }


        class square{
    int side;
    public int Area(){
        return side*side;
    }
    public int parameter(){
        return 4*side;
    }
        }

        class Rectangle{
            int length;
            int breath;

        public int area() {
            return length*breath;
        }
        public int parameter(){
            return 2*(length+breath);
        }
        }
        class Tommy{
    public void Hit(){
        System.out.println("Hitting....");
    }
    public void Run(){
                System.out.println("Running....");
            }
            public void Fire(){
                System.out.println("Firing ....");
            }
        }
public class PracTestCh8 {
    public static void main(String[] args) {


        // Problem 1
//        Employee harry =new Employee();
//        harry.setName("Muhammad Altamash Akhtar");
//        harry.salary=123334;
//        System.out.println(harry.getName());
//        System.out.println(harry.salary);
//
//        // PROBLEM 2
//        Cellphone vivo =new Cellphone();
//        vivo.calling();
//        vivo.vibrating();
//        vivo.Ringing();
//
        // PROBLEM 3
//        square sq =new square();
//        sq.side=3;
//        System.out.println(sq.Area());
//        System.out.println(sq.parameter());

        // PROBLEM 4
//        Rectangle rc =new Rectangle();
//        rc.breath=4;
//        rc.length=2;
//        System.out.println(rc.area());
//        System.out.println(rc.parameter());


        //PROBLEM 5
//        Tommy tm =new Tommy();
//        tm.Fire();
//        tm.Hit();
//        tm.Run();

    }
}
