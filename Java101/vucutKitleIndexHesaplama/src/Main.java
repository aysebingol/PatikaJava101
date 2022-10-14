import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo;
        double kitleIndex;

        Scanner input = new Scanner(System.in);
        System.out.println("boy giriniz :");
        boy = input.nextDouble();
        System.out.println("kilo giriniz");
        kilo = input.nextInt();

        kitleIndex = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz :" + kitleIndex);
    }
}