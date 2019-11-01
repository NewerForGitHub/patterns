package creations.singleton;

/**
 * 懒汉式：第一次引用实例化方法，才进行对象实例化
 */
public final class Singleton_2 {
    /**
     * 属性私有化
     */
    private static Singleton_2 instance;

    /**
     * 私有化构造方法，不能被外部类调用
     */
    private Singleton_2() {

    }

    /**
     * 获取该类实例的静态方法
     * 
     * @return
     */
    public synchronized static Singleton_2 getInstance() {
        if (instance == null) {
            instance = new Singleton_2();
        }
        return instance;
    }
}
