package TinhDientich;
import java.util.Scanner;

public class Retangle extends  Shape{
    private double d;
    private double r;

    public void setInf(double d, double r) {
        this.d = d;
        this.r = r;
    }
    public double getarea(double d,double r) {
        return d*r;
    }
    public double input(Scanner in) {
        System.out.println("Nhap thong tin Retangle:");
        System.out.println("Nhap chieu dai: ");
        d = in.nextDouble();
        return d;
    }
    public double inputR(Scanner in)
    {
        System.out.println("Nhap chieu rong: ");
        r = in.nextDouble();
        return r;
    };
    public void printArea(double d,double r) {
        System.out.println("KQ:" +getarea(d,r));

    }

}
