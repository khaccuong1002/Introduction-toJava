import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = enterNumber();

        if(a >= 0 && a <11) {
            System.out.println(checkZeroToTen(a));
        }

        if(a >= 11 && a <= 20) {
            System.out.println(checkElevenToTwenty(a));
        }

        if(a > 20 && a <100){
            System.out.println(printTwentyToOneHundred(a));
        }

        if (a >= 100) {
            System.out.println(printMoreOneHundred(a));
        }
    }

    public static int enterNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }

    public static String checkZeroToTen(int n){
        String text = "";
        switch (n) {
            case 0:
                text = "Zero";
                break;
            case 1:
                text = "One";
                break;
            case 2:
                text = "Two";
                break;
            case 3:
                text = "Three";
                break;
            case 4:
                text = "Four";
                break;
            case 5:
                text = "Five";
                break;
            case 6:
                text = "Six";
                break;
            case 7:
                text = "Seven";
                break;
            case 8:
                text = "Eight";
                break;
            case 9:
                text = "Nine";
                break;
            case 10:
                text = "Ten";
                break;
        }
        return text;
    }

    public static String checkElevenToTwenty(int n) {
        String text = "";
        switch (n) {
            case 11:
                text = "Eleven";
                break;
            case 12:
                text = "Twelve";
                break;
            case 13:
                text = "Thirteen";
                break;
            case 14:
                text = "Fourteen";
                break;
            case 15:
                text = "Fifteen";
                break;
            case 16:
                text = "Sixteen";
                break;
            case 17:
                text = "Seventeen";
                break;
            case 18:
                text = "Eighteen";
                break;
            case 19:
                text = "Nineteen";
                break;
            case 20:
                text = "Twenty";
                break;
        }
        return text;
    }

    public static String checkTensUnit(int n) {
        String text = "";
        switch (n) {
            case 30:
                text = "Thirty";
                break;
            case 40:
                text = "Forty";
                break;
            case 50:
                text = "Fifty";
                break;
            case 60:
                text = "Sixty";
                break;
            case 70:
                text = "Seventy";
                break;
            case 80:
                text = "Eighty";
                break;
            case 90:
                text = "Ninety";
                break;
        }
        return text;
    }

    public static String printTwentyToOneHundred(int n) {
        int a = (n / 10) * 10;
        int b = n % 10;

        String text = "";

        if (b == 0) {
            text = checkTensUnit(a);
        } else {
            text = checkTensUnit(a) + " " + checkZeroToTen(b);
        }
        return text;
    }

    public static String printMoreOneHundred(int n) {
        int a = n/ 100;
        int b = n % 100;

        String temp = "";

        if (b <= 10) {
            temp = checkZeroToTen(b);
        } else if (b > 10 && b < 20) {
            temp = checkElevenToTwenty(b);
        } else if (b > 20 && b < 100) {
            temp = printTwentyToOneHundred(b);
        } else {
            temp = "Khong tim thay";
        }

        String text = checkZeroToTen(a) + " hundred and " + temp;

        return text;
    }
}