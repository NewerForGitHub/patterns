package creations.factory.factiorymethod.examples.diagram;

/**
 * 具体工厂角色
 */
public class ConcreteCreator implements Creator {
    @Override
    public <T extends Product> T factory(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
