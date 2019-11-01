package creations.factory.factiorymethod.examples.diagram;

/**
 * 抽象工厂角色
 */
public interface Creator {
    /**
     * 工厂方法<br/>
     * 创建一个产品对象，入参类型可自行设置
     * 
     * @param c
     * @param <T>
     * @return
     */
    <T extends Product> T factory(Class<T> c);
}
