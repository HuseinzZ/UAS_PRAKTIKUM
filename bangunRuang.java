public class bangunRuang {
    private int panjang;
    private int lebar;
    private int tinggi;
    private int diameter;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int luasBalok() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    public int volumeBalok() {
        return panjang * lebar * tinggi;
    }

    public float luasBola() {
        float jariJari = diameter / 2.0f;
        return 4 * (float) (Math.PI * jariJari * jariJari);
    }

    public float volumeBola() {
        float jariJari = diameter / 2.0f;
        return 4.0f / 3.0f * (float) ((Math.PI * jariJari * jariJari * jariJari) / 6);
    }
}
