import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1, sayi2, secim;

        Scanner input = new Scanner(System.in);

        System.out.println("sayi1 giriniz");
        sayi1 = input.nextInt();
        System.out.println("sayi2 giriniz");
        sayi2 = input.nextInt();
        System.out.println("seçiminiz");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println("toplama :" + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("çıkarma :" + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("çarpma :" + (sayi1 * sayi2));
                break;
            case 4:
                if (sayi2 != 2) {
                    System.out.println("bölme :" + (sayi1 / sayi2));
                } else {
                    System.out.println("bir sayı 0'a bölünemez");
                }
                break;
            default:
                System.out.println("hatalı seçim yaptınız");
        }

































      /*  int n1,n2,select;

        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz");
        n1 = input.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz : ");
        select = input.nextInt();

        if(select == 1) {
            System.out.println("toplam : " +(n1+n2));

        }else if (select == 2) {
            System.out.println("cikarma : " +(n1-n2));
        } else if (select  ==3) {
            System.out.println("carpma : " +(n1*n2));
        }else if(select == 4) {
            if(n2!=0){
                System.out.println("bölme : " +(n1/n2));
            }else {
                System.out.println("bir sayı o'a bölünemez");
            }
        }else {
            System.out.println("yanlış seçim yaptınız");
        }

       */
    }
}