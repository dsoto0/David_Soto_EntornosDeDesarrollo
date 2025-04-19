public class Main {
    public static void main(String[] args) {
        Ds_Circulo circulo1 = new Ds_Circulo(3, 3, "verde");
        Ds_Rectangulo rectangulo1 = new Ds_Rectangulo(3, 4, 2, "rojo");
        imprimirResultados(circulo1, rectangulo1);
    }
    public static double areaDiferencia(double area1, double area2) {
        return area1 - area2;
    }
    public static void imprimirResultados(Ds_Circulo circulo, Ds_Rectangulo rectangulo) {
        System.out.println("Área del rectángulo: " + rectangulo.areaRectangulo());
        System.out.println("Área del círculo: " + circulo.areaCirculo());
        System.out.println("Diferencia entre áreas: " + areaDiferencia(rectangulo.areaRectangulo(), circulo.areaCirculo()));
    }
}


