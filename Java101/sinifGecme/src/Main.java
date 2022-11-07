import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        double average;
        int toplamNot=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("matematik notunuzu giriniz");
        mat = scanner.nextInt();
        if (mat<0 || mat>100) {
            System.out.println("hatalı not girdiniz");
        }else {
            toplamNot += mat;
        }
        System.out.println("fizik notunuzu giriniz.Ortalamaya dahil edilmeyecektir.");
        fizik = scanner.nextInt();
        if (fizik<0 || fizik>100) {
            System.out.println("hatalı not girdiniz.Ortalamaya dahil edilmeyecektir.");
        }else {
            toplamNot += fizik;
        }
        System.out.println("türkçe notunuzu giriniz.Ortalamaya dahil edilmeyecektir.");
        turkce = scanner.nextInt();
        if (turkce<0 || turkce>100) {
            System.out.println("hatalı not girdiniz.Ortalamaya dahil edilmeyecektir.");
        }else {
            toplamNot += turkce;
        }
        System.out.println("kimya notunuzu giriniz.Ortalamaya dahil edilmeyecektir.");
        kimya = scanner.nextInt();
        if (kimya<0 || kimya>100) {
            System.out.println("hatalı not girdiniz.Ortalamaya dahil edilmeyecektir.");
        }else  {
            toplamNot += kimya;
        }
        System.out.println("müzik notunuzu giriniz.Ortalamaya dahil edilmeyecektir.");
        muzik = scanner.nextInt();
        if (muzik<0 || muzik>100) {
            System.out.println("hatalı not girdiniz.Ortalamaya dahil edilmeyecektir.");
        }else {
            toplamNot += muzik;
        }

        System.out.println(toplamNot);
       double  avarage = (toplamNot) / 5;

        if(avarage<=55) {
            System.out.println("sınıfta kaldınız");
        }else {
            System.out.println("sınıfı geçtiniz");
        }
    }
}