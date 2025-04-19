public class Ds_Circulo {
    
    public double areaCirculo() {
        return 3.14 * this.radio * this.radio;
    }
    private int id;
    private double radio;
    private String color;

    public Ds_Circulo() {
        this.id = 0;
        this.radio = 0.0;
        this.color = "sin color";
    }

    public Ds_Circulo(int id, double radio, String color) {
        this.id = id;
        this.radio = radio;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ds_Circulo{" + "id=" + id + ", radio=" + radio + ", color=" + color + '}';
    }
    //Comentario
}
