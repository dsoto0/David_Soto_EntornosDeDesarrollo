public class Main {
    public static void main(String[] args) {
        Ds_Circulo circulo1 = new Ds_Circulo(3, 3, "verde");
        Ds_Rectangulo rectangulo1 = new Ds_Rectangulo(3, 4, 2, "rojo");
        double ladoA = rectangulo1.getLadoA();
        double ladoB = rectangulo1.getLadoB();
        double area1 = ladoA * ladoB;
        System.out.println("Área rectángulo: " + area1);
        double radio1 = circulo1.getRadio();
        double area2 = radio1 * radio1 * 3.14;
        System.out.println("Área círculo: " + area2);
        double diferencia = area1 - area2;
        System.out.println("Diferencia áreas: " + diferencia);
        System.out.println("Rectángulo: " + rectangulo1);
        System.out.println("Círculo: " + circulo1);
        System.out.println("Diferencia: " + diferencia);
    }
}
