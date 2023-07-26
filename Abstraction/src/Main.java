import model.Car;
import model.Opel;

public class Main {
    public static void main(String[] args) {
        Opel opel = new Opel();
        opel.setBrand("opel");
        opel.setColor("white");
        opel.setHorsePower(100);
        opel.setWeight(1000);
        opel.setModel("corsa");

        Car mercedes = new Opel(); //polimorphism
        opel.setBrand("mercedes");
        opel.setColor("red");
        opel.setHorsePower(150);
        opel.setWeight(1000);
        opel.setModel("GLK");

    }
}