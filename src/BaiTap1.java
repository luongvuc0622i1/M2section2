import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Menu");
        System.out.println("1. Vẽ hình chữ nhật");
        System.out.println("2. Vẽ hình tam giác xuôi");
        System.out.println("3. Vẽ hình tam giác ngược");
        System.out.println("4. Vẽ hình tam giác cân");
        System.out.println("0. Thoát");
        System.out.println("Nhập vào lựa chọn: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hình chữ nhật");
                for (int i=0; i<3; i++) {
                    System.out.println("* * * * * *");
                }
                break;
            case 2:
                System.out.println("Hình tam giác xuôi");
                for (int i=0; i<6; i++) {
                    for (int j=0; j<i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Hình tam giác ngược");
                for (int i=0; i<6; i++) {
                    for (int j=6; j>i; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Hình tam giác cân");
                for (int i=0; i<6; i++) {
                    for (int j=6; j>i; j--) {
                        System.out.print(" ");
                    }
                    for (int h=-1; h<2*i; h++) {
                        System.out.print("*");
                    }
//                    for (int h=-1; h<i; h++) {
//                        System.out.print("* ");
//                    }
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
