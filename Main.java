public class Main {

    public static void main(String[] args) {
        Ds_Rectangulo rectangulo = new Ds_Rectangulo(5.0, 10.0, "Rojo");
        Ds_Circulo circulo = new Ds_Circulo(7.0, "Azul");
        double areaRectangulo = calcularAreaRectangulo(rectangulo);
        double areaCirculo = calcularAreaCirculo(circulo);
        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Área del círculo: " + areaCirculo);
    }
    public static double calcularAreaRectangulo(Ds_Rectangulo rectangulo) {
        return rectangulo.getLadoA() * rectangulo.getLadoB();
    }
    public static double calcularAreaCirculo(Ds_Circulo circulo) {
        return Math.PI * circulo.getRadio() * circulo.getRadio();
    }
}