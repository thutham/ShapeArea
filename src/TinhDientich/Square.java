package TinhDientich ;

public  class Square extends Shape {

    private double d;
    public double getArea(double d){
        return d*d;

    }
    public double setR(double d) {
        this.d = d;
        return d;
    }

    @Override
    public double getChuvi(double d) {
        return 4*d;
    }
    @Override
    public void printChuvi(double d) {
        System.out.println("KQ:" +getChuvi(d));
    }

    @Override
    public void printArea(double d) {
        System.out.println("KQ:" +getArea(d));

    }
}
