package design.create.builder;


public class BuliderClient {

    public static void main(String[] args) {
        ProductBuilder productBuilder = new ProductBuilder();
        Product product = productBuilder
                .buildPart1()
                .buildPart3().buildProduct();
        product.show();

    }
}
