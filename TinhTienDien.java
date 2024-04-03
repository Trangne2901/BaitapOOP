import java.util.Scanner;

public class TinhTienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện tiêu thụ trong tháng (kWh): ");
        int soDienTieuThu = sc.nextInt();
        double tienDien = tinhTienDien(soDienTieuThu);

        System.out.println("Số tiền điện phải trả trong tháng là: " + tienDien + " đồng");

        sc.close();
    }

    public static double tinhTienDien(int soDienTieuThu) {
        double tienDien = 0;

        if (soDienTieuThu <= 50) {
            tienDien = soDienTieuThu * 1.678;
        } else if (soDienTieuThu <= 100) {
            tienDien = 50 * 1.678 + (soDienTieuThu - 50) * 1.734;
        } else if ( soDienTieuThu <= 200) {
            tienDien = 50 * 1.678 + 50 * 1.734 + (soDienTieuThu - 100) * 2.014;
        } else if ( soDienTieuThu <=300){
            tienDien = 50 * 1.678 + 50 * 1.1734 + 50 * 2.014 + (soDienTieuThu - 200) * 2.536;
        } else if (soDienTieuThu <= 400){
            tienDien = 50 * 1.678 + 50 * 1.1734 + 50 * 2.014 + 50 * 2.536 + (soDienTieuThu - 300) * 2.834;
        } else{
            tienDien = 50 * 1.678 + 50 * 1.1734 + 50 * 2.014 + 50 * 2.834 + (soDienTieuThu - 400) * 2.927;
        }


        return tienDien;



    }
}
