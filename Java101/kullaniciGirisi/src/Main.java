import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        String response;

        Scanner input = new Scanner(System.in);

        System.out.println("kullanıcı adınızı giriniz :");
        userName = input.nextLine();
        System.out.println("şifrenizi giriniz :");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("giriş yaptınız");
        } else {
            System.out.println("kullanıcı adı veya şifre hatalı. Parolayı sıfırlamak istiyor musunuz?(evet - hayır):");
            response = input.nextLine();

            if (response.equals("evet")) {
                System.out.println("yeni parola");
                String yeniParola = input.nextLine();
                System.out.println("tekrar giriniz");
                String yeniParola2 = input.nextLine();

                if (yeniParola.equals(yeniParola2)) {
                    System.out.println("güncellendi");
                } else {
                    System.out.println("şifreler farklı");
                }
            } else {
                System.out.println("mevcut şifreyi tekrar deneyin");
            }
        }

    }
}