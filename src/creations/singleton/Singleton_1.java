package creations.singleton;

/**
 * 饿汉式：类加载时，进行对象实例化
 */
public final class Singleton_1 {
    private static Singleton_1 instance = new Singleton_1();

    /**
     * 私有化构造方法，不能被外部类调用
     */
    private Singleton_1() {

    }

    /**
     * 获取该类实例的静态方法
     * 
     * @return
     */
    public static Singleton_1 getInstance() {
        return instance;
    }
}
