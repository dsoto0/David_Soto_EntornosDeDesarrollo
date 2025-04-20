/**
 * Autor: David
 * Versión: 1.0
 * Clase principal que instancia objetos de las clases Ds_Circulo y Ds_Rectangulo,
 * y calcula sus áreas y la diferencia entre ellas.
 */
public class Main {
    /**
     * Método principal del programa.
     * 
     * @param args argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        Ds_Circulo circulo1 = new Ds_Circulo(3, 3, "verde");
        Ds_Rectangulo rectangulo1 = new Ds_Rectangulo(3, 4, 2, "rojo");
        imprimirResultados(circulo1, rectangulo1);
    }
    /**
     * Calcula la diferencia entre dos áreas.
     * 
     * @param area1 primera área.
     * @param area2 segunda área.
     * @return diferencia entre las áreas.
     */
    public static double areaDiferencia(double area1, double area2) {
        return area1 - area2;
    }
    /**
     * Imprime los resultados del área del círculo, área del rectángulo,
     * y la diferencia entre ambas.
     * 
     * @param circulo objeto de tipo Ds_Circulo.
     * @param rectangulo objeto de tipo Ds_Rectangulo.
     */
    public static void imprimirResultados(Ds_Circulo circulo, Ds_Rectangulo rectangulo) {
        System.out.println("Área del rectángulo: " + rectangulo.areaRectangulo());
        System.out.println("Área del círculo: " + circulo.areaCirculo());
        System.out.println("Diferencia entre áreas: " + areaDiferencia(rectangulo.areaRectangulo(), circulo.areaCirculo()));
    }
}
