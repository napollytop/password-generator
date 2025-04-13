class Player{
    String nama;
    int speed;
    int health;
    void run(){
        if(health == 0){
            System.out.println("Game over !");
        } else{
            System.out.println(" Aku Raja !");

        }
    }
}

public class latihan2 {
    public static void main(String[] args) {
        Player burjo = new Player();

        burjo.nama = "budi";
        burjo.speed = 78;
        burjo.health = 0;

        burjo.run();
    }

}
