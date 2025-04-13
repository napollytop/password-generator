import java.security.SecureRandom;
import java.util.Scanner;
public class password_generator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SecureRandom secure = new SecureRandom();

        String besar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String kecil = "abcdefghijklmnopqrstuvwxyz";
        String angka = "12345678910";
        String simbol = "<!@#$>%&*";

        String kumpulanKarakter = "";

        StringBuilder password = new StringBuilder();

        System.out.println("masukkan panjang password : ");
        int panjang = scanner.nextInt();
        scanner.nextLine();

        if(panjang < 4){
            System.out.println("minimal 5");
            return;
        }

        System.out.println("pakai huruf besar? (y/n)");
        String hurufBesar = scanner.nextLine();
        if (!hurufBesar.equalsIgnoreCase("y") && !hurufBesar.equalsIgnoreCase("n")) {
            System.out.println("Input salah! ");
            return;
        }
        if(hurufBesar.equalsIgnoreCase("y")){
            kumpulanKarakter += besar;
            password.append(besar.charAt(secure.nextInt(besar.length())));
        } else {
            System.out.println("huruf besar tidak akan di tambahkan.");
        }

        System.out.println("pakai huruf kecil? (y/n)");
        String hurufKecil = scanner.nextLine();
        if (!hurufKecil.equalsIgnoreCase("y") && !hurufKecil.equalsIgnoreCase("n")) {
            System.out.println("Input salah! Program berhenti.");
            return;
        }
        if (hurufKecil.equalsIgnoreCase("y")) {
            kumpulanKarakter += kecil;
            password.append(kecil.charAt(secure.nextInt(kecil.length())));
        } else {
            System.out.println("huruf kecil tidak akan di tambahkan.");
        }


        System.out.println("pakai angka? (y/n)");
        String inputAngka = scanner.nextLine();
        if (!inputAngka.equalsIgnoreCase("y") && !inputAngka.equalsIgnoreCase("n")) {
            System.out.println("Input salah! Program berhenti.");
            return;
        }
        if(inputAngka.equalsIgnoreCase("y")){
            kumpulanKarakter += angka;
            password.append(angka.charAt(secure.nextInt(angka.length())));
        } else {
            System.out.println("angka tidak akan di tambahkan.");
        }


        System.out.println("pakai simbol? (y/n)");
        String inputSimbol = scanner.nextLine();
            if (!inputSimbol.equalsIgnoreCase("y") && !inputSimbol.equalsIgnoreCase("n")) {
                System.out.println("Input salah! Program berhenti.");
                return;
            }
        if(inputSimbol.equalsIgnoreCase("y")){
            kumpulanKarakter += simbol;
            password.append(simbol.charAt(secure.nextInt(simbol.length())));
        } else {
            System.out.println(" simbol tidak akan di tambahkan.");
        }
        if(kumpulanKarakter.isEmpty()){
            System.out.println(" error ya ganteng");
        }


        while(password.length() < panjang){
            int index = secure.nextInt(kumpulanKarakter.length());
            password.append(kumpulanKarakter.charAt(index));

        }

        System.out.println("password mu insyaallah kuat tidak seperti onana, jangan lupa berdoa! : ");
        System.out.println(password);


    }


}
