import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c, u;

        Scanner input = new Scanner(System.in);
        System.out.println("a kenarı giriniz :");
        a = input.nextInt();
        System.out.println("b kenarı giriniz :");
        b = input.nextInt();
        System.out.println("c kenarı giriniz :");
        c = input.nextInt();

        double cevre, alan;
        u = (a + b + c) / 2;
        cevre = ((a + b + c) / 2) * 2;
        alan = (int) Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("üçgenin alan :" + alan);
        System.out.println("cevre :" + cevre);
    }
}

