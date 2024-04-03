import java.util.Scanner;
public class PT_Bac1 {
    public static void main(String[] args) {
        System.out.println("Phương trình 'a * x + b = c' có :");
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

            if (a!=0){
                double answer =  ( c- b) / a;
                System.out.println("Phương trình có nghiệm x= " + answer);
            }else if(b==c){
                System.out.println ("Phương trình vô số nghiệm");
            }else {
                System.out.print("Phương trình vô nghiệm");
            }
        }
    }

