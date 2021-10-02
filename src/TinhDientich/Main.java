package TinhDientich;
import java.util.Scanner;

public class Main {
    Shape shape = new Shape();
    Square square = new Square();
    Circle circle = new Circle();
    Retangle retangle = new Retangle();

    //Loai hinh hoc
    public static String inputInfo(Scanner in){
        System.out.println("Nhap hinh muon tao: [1]:Square [2]Circle [3]Retangle");
        String n = in.next();
        return n;
    }
    public static boolean isNumber(String str){
        if(str == null){
            return false;
        }
        try{
            int n = Integer.parseInt(str);
        } catch (NumberFormatException nfe){
            return false;
        }
        return true;
    }
    public static boolean checkInput(String str){
        if (isNumber(str)==true){
            int i = Integer.parseInt(str);
            if ( i ==1 || i==2 || i==3){
                return true;
            }
            else
                return false;
        }
        return false;
    }
    //Nhap muon loai tinh
    public static String inputCacultorType(Scanner in){
        System.out.println("Ban muon tinh Dien Tich hay Chu vi: [1]:Dientich [2]Chuvi");
        String type = in.next();
        return type;
    }
    public static boolean checkInputType(String str){
        if (isNumber(str)==true){
            int i = Integer.parseInt(str);
            if ( i ==1 || i==2){
                return true;
            }
            else
                return false;
        }
        return false;
    }
    public static void GetAreaResult(Shape shape, Square square, Circle circle, Retangle retangle,int n,double r,double d){
        if (n ==1){

            square.printArea(d);
        }
        else if ( n==2){
            circle.printArea(r);
        }
        else{
            retangle.printArea(d, r);
        }

    }

    //chuvi
    public static void GetChuviResult(Shape shape, Square square, Circle circle, Retangle retangle,int n,double r,double d){

        if (n ==1){
            square.printChuvi(r);
        }
        else if ( n==2){
            circle.printChuvi(r);
        }
        else{
            retangle.printChuvi(d,r);
        }

    }
    public static void main(String args[]) {

        Shape shape = new Shape();
        Square square = new Square();
        Circle circle = new Circle();
        Retangle retangle = new Retangle();
        Scanner in = new Scanner(System.in);
        double r=0 , d=0;
        String calcul = inputCacultorType(in);
        while(checkInputType(calcul)!=true){
            System.out.println("Nhap lai di sai roi");
            calcul= inputCacultorType(in);

        }
        int Cacultype = Integer.parseInt(calcul);
        String str= inputInfo(in);
        while (checkInput(str) !=true ){
            System.out.println("Nhap lai di sai roi");
            str= inputInfo(in);
        }
        int shapeType = Integer.parseInt(str);
        if (shapeType ==1){
            System.out.println("Nhap canh: ");
            d = square.setR(in.nextInt());
        }
        else if (shapeType ==2){
            System.out.println("Nhap ban kinh: ");
            r = circle.setR(in.nextInt());
        }
        else{
            System.out.println("Nhap chieu dai: ");
            d=retangle.setD(in.nextInt());
            in.nextLine();
            System.out.println("Nhap chieu rong: ");
            r=retangle.setR(in.nextInt());
        }
        if ( Cacultype ==1){
            GetAreaResult(shape,square,circle,retangle,shapeType,r,d);
        }
        else {
            GetChuviResult(shape,square,circle,retangle,shapeType,r,d);
        }

    }
}
