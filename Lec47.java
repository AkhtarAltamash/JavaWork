package demo;

class EkClass{
        int a;

    public int getA() {
        return a;
    }
    EkClass(int a){
       this.a =a;//print kardyga
     //   a=a;//print nahi kary ga confuse ho jayga

    }
    public int returnOne(){
        return 1;
    }

        }
        class Doclass extends EkClass{
    Doclass(int c){
        super(c);
        System.out.println("Iam A Constructor");
    }
        }



public class Lec47 {
    public static void main(String[] args) {
            EkClass e=new EkClass(5);
            Doclass d =new Doclass(9);
        System.out.println(e.getA());

    }
}
