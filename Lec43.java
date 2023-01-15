package demo;


class  Cylinder{

        private int radius;
        private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double SurfaceArea(){
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
}



public class Lec43 {

    public static void main(String[] args) {
        // Practise Q1
//        Cylinder MyCylender =new Cylinder();
//        MyCylender.setHeight(12);
//        int h =MyCylender.getHeight();
//        System.out.println(h);
//        MyCylender.setRadius(9);
//        System.out.println(MyCylender.getRadius());

        // Problem Q2:
//        MyCylender.SurfaceArea();
//        System.out.println(MyCylender.SurfaceArea());
        //Problem 3

        Cylinder myCylender =new Cylinder(5,7);
//        myCylender.setHeight(12);
        System.out.println(myCylender.getHeight());
//        MyCylender.setRadius(9);
        System.out.println(myCylender.getRadius());

    }
}
