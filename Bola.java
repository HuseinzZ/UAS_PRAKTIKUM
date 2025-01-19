public class Bola implements bangunRuang {
    private int diameter;
    
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
