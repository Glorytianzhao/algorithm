package design.create.builder;

public class ProductBuilder extends AbstractProductBuilder{



    @Override
    public AbstractProductBuilder buildPart1() {
        product.setPart1("构件1");
        return this;
    }

    @Override
    public AbstractProductBuilder buildPart2() {
        product.setPart2("构件2");
        return this;
    }

    @Override
    public AbstractProductBuilder buildPart3() {
        product.setPart3("构件3");
        return this;
    }
}
