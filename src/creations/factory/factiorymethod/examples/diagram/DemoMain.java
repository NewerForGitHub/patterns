package creations.factory.factiorymethod.examples.diagram;

/**
 * 应用类
 */
public class DemoMain {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factory(ConcreteProduct.class);
        product.method1();
        product.method2();
    }
}
