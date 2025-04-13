import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        int menu;
        int saldo = 5000;



        Scanner keyboard = new Scanner(System.in);

        System.out.println("###################");
        System.out.println(" [0] setor tunai");
        System.out.println(" [1] tarik tunai");

        menu = keyboard.nextInt();

        switch (menu){
            case 0:
                System.out.println("masukkan jumlah uang : ");
                double setor = keyboard.nextDouble();
                saldo += setor;
                System.out.println("setor tunai berhasil, saldo anda adlah : " + saldo);
            break;

            case 1:
                System.out.println(" masukkan jumlah uang : ");
                double tarik = keyboard.nextDouble();
                saldo -= tarik;
                if ( tarik >=saldo){
                    System.out.println("Saldo anda tidak mencukupi");
                } else {
                    System.out.println(" sisa saldo anda adalah " + saldo);
                }
                break;
            default:
                System.out.println(" inputan tidak valid");
        }
    }
}