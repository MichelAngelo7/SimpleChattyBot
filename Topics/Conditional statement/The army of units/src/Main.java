import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int army = scanner.nextInt();
        final int noArmy = 1;
        final int pack = 20;
        final int throng = 250;
        final int zounds = 1000;



        if (army < noArmy) {
            System.out.println("no army");
        } else if (army < pack) {
            System.out.println("pack");
        } else if (army < throng) {
            System.out.println("throng");
        } else if (army < zounds) {
            System.out.println("zounds");
        } else if (army >= zounds) {
            System.out.println("legion");
        }
    }
}