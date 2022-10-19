import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut , elma
                ,domates,muz,
                patlican;
        double toplam;

        double a=2.14,e=3.64,d=1.11,m=0.95,p=5.00;

        Scanner input = new Scanner(System.in);
        System.out.println("armut kilo");
        armut = input.nextInt();
        System.out.println("elma kilo");
        elma = input.nextInt();
        System.out.println("domates kilo");
        domates = input.nextInt();
        System.out.println("muz kilo");
        muz = input.nextInt();
        System.out.println("patlican kilo");
        patlican = input.nextInt();

       toplam = armut*a + elma*e + domates*d + muz*m + patlican*p;
       System.out.println("toplam tutar :" + toplam);

    }
}