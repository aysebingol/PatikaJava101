import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int kenar1, kenar2;
        double kenar3;

        Scanner input = new Scanner(System.in);
        System.out.println("Kenar1 giriniz :");
        kenar1 = input.nextInt();
        System.out.println("kenar2 giriniz :");
        kenar2 = input.nextInt();


        double islem = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        double sonuc = islem;
        System.out.println("sonuc :" + sonuc);

    }
}

