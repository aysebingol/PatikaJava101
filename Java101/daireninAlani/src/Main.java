import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yariCap;
        double alan, cevre;
        double pi = 3.14;
        double aciOlcusu;

        Scanner girdi = new Scanner(System.in);
        System.out.println("Yariçapı giriniz :");
        yariCap = girdi.nextInt();
        System.out.println("Açı Ölçüsü giriniz :");
        aciOlcusu = girdi.nextInt();

        alan = pi * yariCap * yariCap;
        System.out.println("Alan :" + alan);
        cevre = 2 * pi * yariCap;
        System.out.println("cevre :" + cevre);

        double dilimAlan = (pi * (yariCap * yariCap) * aciOlcusu) / 360;
        System.out.println("Daire Diliminin Alanı :" + dilimAlan);
    }
}