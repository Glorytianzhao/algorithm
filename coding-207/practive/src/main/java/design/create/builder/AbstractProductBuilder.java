package design.create.builder;

public abstract class AbstractProductBuilder {

    protected Product product = new Product();

    public abstract AbstractProductBuilder buildPart1();

    public abstract AbstractProductBuilder buildPart2();

    public abstract AbstractProductBuilder buildPart3();

    public Product buildProduct(){
        return product;
    }

}
