/**
 * Autor: David
 * Versión: 1.0
 * Clase que representa un rectángulo, con atributos de id, ladoA, ladoB y color.
 * Permite calcular el área de un rectángulo a partir de sus lados.
 */
public class Ds_Rectangulo {

    /**
     * Calcula el área del rectángulo utilizando la fórmula: ladoA * ladoB.
     * 
     * @return el área del rectángulo.
     */
    public double areaRectangulo() {
        return this.ladoA * this.ladoB;
    }
    
    private int id;
    private double ladoA;
    private double ladoB;
    private String color;

    /**
     * Constructor por defecto.
     * Inicializa el rectángulo con valores por defecto: id = 0, ladoA = 0.0, ladoB = 0.0 y color = "sin color".
     */
    public Ds_Rectangulo() {
        this.id = 0;
        this.ladoA = 0.0;
        this.ladoB = 0.0;
        this.color = "sin color";
    }

    /**
     * Constructor con parámetros.
     * Inicializa un rectángulo con los valores proporcionados.
     * 
     * @param id identificador del rectángulo.
     * @param ladoA primer lado del rectángulo (en cm).
     * @param ladoB segundo lado del rectángulo (en cm).
     * @param color color del rectángulo.
     */
    public Ds_Rectangulo(int id, double ladoA, double ladoB, String color) {
        this.id = id;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.color = color;
    }

    /**
     * Devuelve el ID del rectángulo.
     * 
     * @return el ID numérico del rectángulo.
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve el valor del primer lado del rectángulo.
     * 
     * @return el valor de ladoA del rectángulo (en cm).
     */
    public double getLadoA() {
        return ladoA;
    }

    /**
     * Devuelve el valor del segundo lado del rectángulo.
     * 
     * @return el valor de ladoB del rectángulo (en cm).
     */
    public double getLadoB() {
        return ladoB;
    }

    /**
     * Devuelve el color del rectángulo.
     * 
     * @return el color del rectángulo.
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el ID del rectángulo.
     * 
     * @param id el ID numérico del rectángulo.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Establece el valor del primer lado del rectángulo.
     * 
     * @param ladoA el primer lado del rectángulo (en cm).
     */
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    /**
     * Establece el valor del segundo lado del rectángulo.
     * 
     * @param ladoB el segundo lado del rectángulo (en cm).
     */
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    /**
     * Establece el color del rectángulo.
     * 
     * @param color el color del rectángulo.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Devuelve una representación en forma de cadena del rectángulo.
     * 
     * @return una cadena que representa el rectángulo con su id, lados y color.
     */
    @Override
    public String toString() {
        return "Ds_Rectangulo{" + "id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", color=" + color + '}';
    }

}

