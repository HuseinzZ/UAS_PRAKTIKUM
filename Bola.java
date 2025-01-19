/* Nama : Muhamad Ridwan Husaeni
 * NIM  : 2250085010
 * UAS PRAKTIKUM IMPLEMENTASI PERANGKAT LUNAK
*/

public class Bola implements BangunRuang {
    private int diameter;

    public Bola(int diameter){
        this.diameter = diameter;
    }
    
    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public float hitungLuas() {
        float jariJari = diameter / 2.0f;
        return 4 * (float) (Math.PI * jariJari * jariJari);
    }

    public float hitungVolume() {
        float jariJari = diameter / 2.0f;
        return 4.0f / 3.0f * (float) ((Math.PI * jariJari * jariJari * jariJari) / 6);
    }
}
