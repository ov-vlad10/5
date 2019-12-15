import java.lang.*;
import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        double r;
        Circle k1 = new Circle(8.6, 5, 5.6, "черный");
        System.out.println("ДО = " + k1.getLength() + "см\n");
        Scanner source = new Scanner(System.in);
        System.out.println("Введите радиус:");
        r = source.nextDouble();
        k1.setR(r);
        System.out.println("\nДлина окружности равна " + k1.getLength() + "см");
    }
}
