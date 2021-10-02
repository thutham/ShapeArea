package TinhDientich;
import java.util.Scanner;
public class Circle extends Shape{
    private double r;

    public void setInfor(double r){
        this.r = r;
    }

    public double getArea(double r){
        return r*r*3.14;
    }
    public double input(Scanner in) {
        System.out.println("Nhap thong tin hinh tron:");
        System.out.println("Nhap do dai canh: ");
        r = in.nextDouble();
        return r;
    }

    @Override
    public void printArea(double r) {
        System.out.println("KQ:" +getArea(r));

    }
}
