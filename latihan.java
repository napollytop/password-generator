class mobil{
    String merk;
    String warna;
    int tahun;
}

public class latihan {

    public static void main(String[] args) {
        mobil car = new mobil();

        car.merk = "suzuki";
        car.tahun = 1933;
        car.warna = "hitam";

        System.out.println("merk mobil adalah : " + car.merk);
        System.out.println("tahun mobilnya adalah tahun : " + car.tahun);
        System.out.println("warna mobil ini adalah : " + car.warna);
    }

}
