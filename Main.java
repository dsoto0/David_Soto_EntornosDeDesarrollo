// Main.java
public class Main {
    public static void main(String[] args) {
        Ds_Rectangulo rectangulo = new Ds_Rectangulo(5.0, 3.0, "Azul");
        Ds_Circulo circulo = new Ds_Circulo(5.0, "Rojo");
        double areaRectangulo = rectangulo.calcularArea();
        double areaCirculo = circulo.calcularArea();
        double diferenciaAreas = Math.abs(areaRectangulo - areaCirculo);
        System.out.println(rectangulo);
        System.out.println("Área del Rectángulo: " + areaRectangulo);
        System.out.println(circulo);
        System.out.println("Área del Círculo: " + areaCirculo);
        System.out.println("Diferencia entre áreas: " + diferenciaAreas);
    }
}
