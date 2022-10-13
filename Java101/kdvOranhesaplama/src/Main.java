import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,
                kdvTutar, kdvliTutar;

        Scanner inp = new Scanner(System.in);
        System.out.println("tutar giriniz :");
        tutar = inp.nextDouble();

        boolean kosul1 = tutar < 1000;
        boolean kosul2 = tutar > 1000;

        double kdvOran = (kosul1) ? 1.18 : 0.08;

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        System.out.println("kdvsiz tutar :" + tutar);
        System.out.println("kdv oranı :" + kdvOran);
        System.out.println("kdv tutarı :" + kdvTutar);
        System.out.println("kdvli tutar :" + kdvliTutar);
    }
}

