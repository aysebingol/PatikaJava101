import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,felsefe;

        Scanner input = new Scanner(System.in);

        System.out.print("matematik notunuz:");
        mat = input.nextInt();

        System.out.print("fizik notunuz:");
        fizik = input.nextInt();

        System.out.print("kimya notunuz:");
        kimya = input.nextInt();

        System.out.print("türkçe notunuz:");
        turkce = input.nextInt();

        System.out.print("tarih notunuz:");
        tarih = input.nextInt();

        System.out.print("felsefe notunuz:");
        felsefe = input.nextInt();

        int toplam = mat+fizik+kimya+turkce+tarih+felsefe;
        double sonuc = toplam/6;
        System.out.println("ortalamanız :" + sonuc);

        String str = sonuc>60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);
    }
}
