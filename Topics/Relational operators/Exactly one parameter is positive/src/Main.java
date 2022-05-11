import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        final int test = 0;

        boolean check1 = a > test && b <= test && c <= test;
        boolean check2 = a <= test && b > test && c <= test;
        boolean check3 = a <= test && b <= test && c > test;
        System.out.println(check1 || check2 || check3);

    }
}