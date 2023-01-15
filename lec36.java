package demo;

class MyEmployee{

    private String name;
    private int id;


    public String getName(){
        return name;
    }
    public void setName(String n){
        name =n;
    }

    public int getId(){
        return id;
    }
    public void setId(int i){
        id=i;
    }
}

public class lec36 {
    public static void main(String[] args) {

        MyEmployee e=new MyEmployee();
        e.setId(55);
        e.setName("Muhammad Altamash Akhtar");
        System.out.println(e.getName());
        System.out.println(e.getId());
    }
}
