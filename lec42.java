package demo;


class MyMainEmployee{

    private String name;
    private int id;

//    public  MyMainEmployee(){
//        id=245;
//        name="Muhammad Altamash Akhtar";
//    }
        public  MyMainEmployee(int MyId,String MyName){
            id=MyId;
            name=MyName;
}



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

public class lec42 {
    public static void main(String[] args) {
        MyMainEmployee harry =new MyMainEmployee(234,"Muhammad ");
//        harry.setName("code with harry");
//        harry.getName();
        System.out.println(harry.getName());
        System.out.println(harry.getId());
    }
}
