package TinhDientich;

public class Retangle extends  Shape{
    private double d;
    private double r;
    public double getarea(double d,double r) {
        return d*r;
    }
    public double setR(double r) {
        this.r = r;
        return r;
    }
    public double setD(double d) {
        this.d = d;
        return d;
    }
    public void printArea(double d,double r) {
        System.out.println("KQ:" +getarea(d,r));

    }

    @Override
    public double getChuvi(double d, double r) {
        return 2*(d+r);
    }

    @Override
    public void printChuvi(double d, double r) {
        System.out.println("KQ:" +getChuvi(d,r));
    }
}
