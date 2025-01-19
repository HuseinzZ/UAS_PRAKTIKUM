/* Nama : Muhamad Ridwan Husaeni
 * NIM  : 2250085010
 * UAS PRAKTIKUM IMPLEMENTASI PERANGKAT LUNAK
*/

public class BangunRuangApps {
    public static void main(String[] args) {
        Balok balok = new Balok(10, 5, 4);
        Bola bola = new Bola(9);

        // Menampilkan hasil balok
        System.out.println("Panjang balok = " + balok.getPanjang());
        System.out.println("Lebar balok = " + balok.getLebar());
        System.out.println("Tinggi balok = " + balok.getTinggi());
        System.out.println("Luas permukaan balok = " + String.format("%.2f", balok.hitungLuas()));
        System.out.println("Luas volume balok = " + String.format("%.2f", balok.hitungVolume()));

        // Menampilkan hasil bola
        System.out.println("\nDiameter bola = " + bola.getDiameter());
        System.out.println("Luas permukaan bola = " + String.format("%.2f", bola.hitungLuas()));
        System.out.println("Luas volume bola = " + String.format("%.2f", bola.hitungVolume()));
    }
}

