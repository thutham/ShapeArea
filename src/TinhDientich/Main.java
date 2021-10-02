package TinhDientich;
import java.util.Scanner;

public class Main {
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
    public static void GetResult(int n){
        Shape shape = new Shape();
        Square square = new Square();
        Circle circle = new Circle();
        Retangle retangle = new Retangle();
        Scanner in = new Scanner(System.in);
        if (n ==1){

            square.printArea(square.input(in));
        }
        else if ( n==2){
            circle.printArea(circle.input(in));
        }
        else{
            retangle.printArea(retangle.input(in), retangle.inputR(in));
        }

    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str= inputInfo(in);

        while (checkInput(str) !=true ){
            System.out.println("Nhap lai di sai roi");
            str= inputInfo(in);
        }
        int i = Integer.parseInt(str);
        GetResult(i);
    }
}
