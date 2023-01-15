package demo;

interface Bicycle{
    int a=45;
    void ApplyBreak(int decrement);
    void SpeedUp(int increment);
}
interface HornBicycle{
    void StartHorn(int Start);
    void StopHorn(int stop);
}

class AvonCycle implements Bicycle,HornBicycle{
    void BlowHorn(){
        System.out.println("PEE PEE");

    }
   public void ApplyBreak(int decrement){
        System.out.println("SLOWING DOWN..");
    }
   public void SpeedUp(int increment){
        System.out.println("Speeding Up....");
    }
    public void StartHorn(int Start){
        System.out.println("PEEEEEEEEPPP............");
    }
    public void StopHorn(int stop){
        System.out.println("..........");
    }

}
public class lec54 {
    public static void main(String[] args) {

        AvonCycle Cy =new AvonCycle();
        Cy.ApplyBreak(12);
        System.out.println(Cy.a);
        Cy.StartHorn(12);
        Cy.StopHorn(1);

    }
}
