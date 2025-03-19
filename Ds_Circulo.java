public class Ds_Circulo {
    private int id;
    private double radio;
    private String color;
    public Ds_Circulo() {
        this.radio = 0.0;
        this.color = "Desconocido";
    }
    public Ds_Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
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
    public int getId() {
        return id;
    }
    public double getRadio() {
        return radio;
    }
    public String getColor() {
        return color;
    }
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    @Override
    public String toString() {
        return "Circulo { radio=" + radio + ", color='" + color + "' }";
    }
} 
// Comentario