import java.util.Scanner;
 public class DanhGiaNangLuc {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double diemChuyenCan;
         double diemKiemTra;
         double diemThiCuoiKi;
         System.out.print("Nhập điểm chuyên cần:" );
         diemChuyenCan = sc.nextDouble();
         System.out.print("Nhập điểm kiểm tra:");
         diemKiemTra = sc.nextDouble();
         System.out.print("Điểm thi cuối kì:");
         diemThiCuoiKi = sc.nextDouble();
         double diemTrungBinh = ( diemChuyenCan + diemKiemTra + diemThiCuoiKi)/3;
         System.out.print("Điểm Trung Bình là: " + diemTrungBinh);
         if(diemTrungBinh >10){
             System.out.print("Lỗi");
         }else if( diemTrungBinh >= 8.5){
             System.out.print("Xếp loại a");
         }else if( 7 <= diemTrungBinh ){
             System.out.print( "Xếp loại B");
         }else if( 5.5 <= diemTrungBinh ){
             System.out.print("Xếp loại C");
         } else if( 4 <= diemTrungBinh ) {
             System.out.print ("Xép loại D");
         }else if (  diemTrungBinh < 4){
             System.out.print("Xếp loại F");
         }else {
             System.out.print ("lỗi");
         }
     }
}
