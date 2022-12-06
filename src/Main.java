import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vnd = 24000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD: ");
        usd = scanner.nextDouble();
        double change = usd * vnd;
        System.out.println("Giá trị VND: " + change);
    }
}