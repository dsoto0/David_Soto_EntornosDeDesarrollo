/**
 * Autor: David
 * Versión: 1.0
 * Clase que representa un círculo, con atributos de id, radio y color.
 * Permite calcular el área de un círculo a partir de su radio.
 */
public class Ds_Circulo {
    private static final double PI = 3.14;

    /**
     * Calcula el área del círculo utilizando la fórmula: Pi * radio^2.
     * 
     * @return el área del círculo.
     */
    public double areaCirculo() {
        return PI * this.radio * this.radio;
    }

    private int id;
    private double radio;
    private String color;

    /**
     * Constructor por defecto.
     * Inicializa el círculo con valores por defecto: id = 0, radio = 0.0 y color = "sin color".
     */
    public Ds_Circulo() {
        this.id = 0;
        this.radio = 0.0;
        this.color = "sin color";
    }

    /**
     * Constructor con parámetros.
     * Inicializa un círculo con los valores proporcionados.
     * 
     * @param id identificador del círculo.
     * @param radio radio del círculo (en cm).
     * @param color color del círculo.
     */
    public Ds_Circulo(int id, double radio, String color) {
        this.id = id;
        this.radio = radio;
        this.color = color;
    }

    /**
     * Devuelve el ID del círculo.
     * 
     * @return el ID numérico del círculo.
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve el radio del círculo.
     * 
     * @return el radio del círculo (en cm).
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Devuelve el color del círculo.
     * 
     * @return el color del círculo.
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el ID del círculo.
     * 
     * @param id el ID numérico del círculo.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Establece el radio del círculo.
     * 
     * @param radio el radio del círculo (en cm).
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Establece el color del círculo.
     * 
     * @param color el color del círculo.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Devuelve una representación en forma de cadena del círculo.
     * 
     * @return una cadena que representa el círculo con su id, radio y color.
     */
    @Override
    public String toString() {
        return "Ds_Circulo{" + "id=" + id + ", radio=" + radio + ", color=" + color + '}';
    }
}
