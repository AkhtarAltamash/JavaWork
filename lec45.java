package demo;


class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println(" I am in base Setting X Now");
        this.x = x;
    }

    public void PrintMe(){
        System.out.println("I am A Constructor");
    }


}
        class Derived extends Base{
            int y;

            public int getY() {
                return y;
            }

            public void setY(int y) {
                this.y = y;
            }
        }
public class lec45 {
    public static void main(String[] args) {
        Base b =new Base();
        b.setX(4);
        System.out.println(b.getX());
        // For Derive
        Derived d=new Derived();
        d.setX(4);
        System.out.println(d.getX());



    }
}
