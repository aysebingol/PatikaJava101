import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        int acilisUcret = 10;
        double kmBasina = 2.20;

        Scanner input = new Scanner(System.in);
        System.out.println("km giriniz :");
        km = input.nextInt();

        double taksiMetre = (km * kmBasina) + acilisUcret;
        double tutar = taksiMetre;
        System.out.println(tutar);
        
        double kosul = tutar < 20 ? 20 : tutar;
        System.out.println(kosul);


    }
}