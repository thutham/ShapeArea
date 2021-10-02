package TinhDientich ;
import java.util.Scanner;

public class Square extends Shape {

    private double d;

    @Override
    public void setInf(double d) {
        this.d = d;
    }

    public double getArea(double d){
        return d*d;

    }
    public double input(Scanner in) {
        System.out.println("Nhap thong tin hinh vuong:");
        System.out.println("Nhap do dai canh: ");
        d = in.nextDouble();
        return d;
    }
    @Override
    public void printArea(double d) {
        System.out.println("KQ:" +getArea(d));

    }
}
