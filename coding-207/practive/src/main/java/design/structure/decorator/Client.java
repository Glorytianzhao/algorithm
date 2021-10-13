package design.structure.decorator;

import design.structure.proxy.Car;
import design.structure.proxy.QiCar;

public class Client {

    public static void main(String[] args) {
        Car qiCar = new QiCar();
        BenChiQiCar benChiQiCar = new BenChiQiCar(qiCar);
        benChiQiCar.run();
    }
}
