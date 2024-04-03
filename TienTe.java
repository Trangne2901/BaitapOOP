import java.util.Scanner;

public class TienTe {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhập số tiền USD : ");
                double vnd = 23.000;
                double usd;
                usd = sc.nextDouble();
                double quydoi = usd *23.000;
                System.out.println( "Giá trị VND :" +quydoi );
        }
    }
