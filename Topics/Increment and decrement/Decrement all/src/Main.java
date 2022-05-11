import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code


        int n = 0;

        while (scanner.hasNext()) {
            n = scanner.nextInt();
            System.out.print(--n + " ");
        }
    }
}
