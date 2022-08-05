import java.util.Scanner;

public class GreateCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Nhập vào a: ");
        int a = Math.abs(sc.nextInt());

        System.out.println("Nhập vào b: ");
        int b = Math.abs(sc.nextInt());

        if(a==0||b==0) {
            System.out.println("Không có ước chung lớn nhất");
        } else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("Ước chung lớn nhất là: " + a);
        }
    }
}
