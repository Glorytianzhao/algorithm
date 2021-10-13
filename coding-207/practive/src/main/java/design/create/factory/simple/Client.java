package design.create.factory.simple;

public class Client {

    public static void main(String[] args) {

        TargetFactory targetFactory = new TargetFactory();
        ColorInterface white = targetFactory.getTarget("White");
        white.print();
    }
}
