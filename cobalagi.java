import java.security.SecureRandom;
import java.util.Scanner;
public class cobalagi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SecureRandom secure = new SecureRandom();

        String besar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String kecil = "abcdefghijklmnopqrstuvxyz";
        String angka = "12345678910";
        String simbol = "<!@#$>%&*";

        String kumpulanKarakter = "";

        StringBuilder password = new StringBuilder();

        System.out.println("masukkan panjang password : ");

        int panjang = scanner.nextInt();
        scanner.nextLine();


        System.out.println("pakai huruf besar? (y/n)");
        String hurufBesar = scanner.nextLine();
        if(hurufBesar.equalsIgnoreCase("y")){
            kumpulanKarakter += besar;
            password.append(besar.charAt(secure.nextInt(besar.length())));
        } else {
            System.out.println("huruf besar tidak akan di tambahkan.");
        }

        System.out.println("pakai huruf kecil? (y/n)");
        String hurufKecil = scanner.nextLine();
        if (hurufKecil.equalsIgnoreCase("y")) {
            kumpulanKarakter += kecil;
            password.append(kecil.charAt(secure.nextInt(angka.length())));
        } else {
            System.out.println("huruf kecil tidak akan di tambahkan.");
        }


        System.out.println("pakai angka? (y/n)");
        String inputAngka = scanner.nextLine();
        if(inputAngka.equalsIgnoreCase("y")){
            kumpulanKarakter += angka;
            password.append(angka.charAt(secure.nextInt(kecil.length())));
        } else {
            System.out.println("angka tidak akan di tambahkan.");
        }


        System.out.println("pakai simbol? (y/n)");
        String inputSimbol = scanner.nextLine();
        if(inputSimbol.equalsIgnoreCase("y")){
            kumpulanKarakter += simbol;
            password.append(simbol.charAt(secure.nextInt(simbol.length())));
        } else {
            System.out.println(" simbol tidak akan di tambahkan.");
        }
        if(kumpulanKarakter.isEmpty()){
            System.out.println(" error cuy harus milih y satu ya ganteng");
        }

        while(password.length() < panjang){
            int index = secure.nextInt(kumpulanKarakter.length());
            password.append(kumpulanKarakter.charAt(index));

        }

        System.out.println("password mu insyaallah kuat tidak seperti onana, jangan lupa berdoa! : ");
        System.out.println(password);


    }


}
