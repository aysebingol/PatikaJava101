import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklik;

        Scanner scanner = new Scanner(System.in);

        System.out.println("sıcaklık değerini giriniz");
        sicaklik = scanner.nextInt();

        if (sicaklik<=5) {
            System.out.println("kayak");
        } else if (sicaklik>=10 && sicaklik<=15) {
            System.out.println("sinema");
        } else if (sicaklik>=10 && sicaklik<=25) {
            System.out.println("piknik");
        } else {
            System.out.println("yüzme");
        }
       /* int heat;

        Scanner scanner = new Scanner(System.in);
        System.out.println("sıcaklık giriniz :");
        heat = scanner.nextInt();

        if (heat < 5) {
            System.out.println("kayak yapabilirsiniz");
        } else if (heat >= 5 && heat <= 25) {
            System.out.println("kayak gidebilirsiniz");
            if (heat <= 15) {
                System.out.println("sinemaya gidebilirsiniz");
            }
            if (heat >= 10) {
                System.out.println("pikniğe gidebilirsiniz");
            }
        } else {
            System.out.println("yüzmeye gidebilirsiniz");

        }

        */
    }
}