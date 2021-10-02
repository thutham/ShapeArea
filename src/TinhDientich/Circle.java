package TinhDientich;
public class Circle extends Shape{
    private double r;

    public double getArea(double r){
        return r*r*3.14;
    }
    public double setR(double r) {
        this.r = r;
        return r;
    }
    @Override
    public void printArea(double r) {
        System.out.println("KQ:" +getArea(r));

    }


    @Override
    public double getChuvi(double r) {
        return r*2*3.14;
    }

    @Override
    public void printChuvi(double r) {
        System.out.println("KQ:" +getChuvi(r));
    }
}
