package creations.singleton.examples;

/**
 * 人类
 */
public class Person {
    /**
     * 初始化取快递的人
     */
    private static Person person = new Person();

    /**
     * 取件次数
     */
    private int num = 0;

    /**
     * 隐藏构造函数
     */
    private Person() {

    }

    /**
     * 获取实例
     * 
     * @return
     */
    public static Person getInstance() {
        return person;
    }

    /**
     * 业务方法
     */
    public synchronized String getAnswer() {
        return "我是王小华，请稍等马上来！这是第" + ++num + "个快递！";
    }

}
