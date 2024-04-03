import java.util.Scanner;

public class TH_bim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Nhập cân nặng(kg):");
        weight = sc.nextDouble();

        System.out.print("Nhập chiều cao(m):");
        height = sc.nextDouble();
        bmi = weight / Math.pow(height, 2);

        if (bmi < 18)
            System.out.print( bmi+ "  Gầy quá");
        else if (bmi < 25.0)
            System.out.print(  bmi + "   Chuẩn");
        else if (bmi < 30.0)
            System.out.print( + bmi+ "   Thừa cân xíu");
        else{
            System.out.print( +bmi+ "   Béo quaaaaa");}
    }
}