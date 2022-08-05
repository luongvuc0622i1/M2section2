import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Nhập vào số tiền gửi:");
        long money = sc.nextLong();

        System.out.println("Nhập vào số tháng gửi:");
        int month = sc.nextInt();

        System.out.println("Nhập vào số lãi suất gửi:");
        double interestRate = sc.nextDouble();

        double totalInterest =0;
        for (int i=0; i<month; i++) {
            totalInterest += money * (interestRate/100) * month/12;
        }
        System.out.println(totalInterest);
    }
}
