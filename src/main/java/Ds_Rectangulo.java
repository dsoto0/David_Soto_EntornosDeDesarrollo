public class Ds_Rectangulo {
    private int id;
    private double ladoA;
    private double ladoB;
    private String color;
    
    public Ds_Rectangulo() {
        this.id = 0;
        this.ladoA = 0.0;
        this.ladoB = 0.0;
        this.color = "sin color";
    }

    public Ds_Rectangulo(int id, double ladoA, double ladoB, String color) {
        this.id = id;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ds_Rectangulo{" + "id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", color=" + color + '}';
    }

}
