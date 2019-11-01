package creations.singleton.examples;

import java.util.Random;

/**
 * 业务类
 */
public class SingletonDemo {
    public static void main(String[] args) {
        CourierThread thread1 = new CourierThread("线程1");
        CourierThread thread2 = new CourierThread("线程2");
        thread1.start();
        thread2.start();
    }
}

class CourierThread extends Thread {
    String[] couriers = { "顺丰快递", "申通快递", "圆通快递", "韵达快递", "天天快递" };
    String threadName;

    public CourierThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        Person person = Person.getInstance();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + "：你好，我是【"
                + couriers[random.nextInt(couriers.length)]
                + "】请问您是王小华吗？有你的快递，请来取快递！");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("回答：" + threadName + "\t" + person.getAnswer());
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}