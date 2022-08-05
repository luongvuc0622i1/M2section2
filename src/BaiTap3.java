public class BaiTap3 {
    public static void main(String[] args) {
        for (int number=2; number<=100 ;number++) {
            int i=2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) System.out.println(number + " is a prime");
        }
    }
}
