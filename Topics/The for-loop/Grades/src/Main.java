import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int x = scanner.nextInt();

        String input = "";
        for (int i = 0; i <= x; i++) {
            input = scanner.nextLine();
            if ("A".equals(input)) {
                a++;
            } else if ("B".equals(input)) {
                b++;
            } else if ("C".equals(input)) {
                c++;
            } else if ("D".equals(input)) {
                d++;
            }
        }
        System.out.print(d + " " + c + " " + b + " " + a);
    }
}