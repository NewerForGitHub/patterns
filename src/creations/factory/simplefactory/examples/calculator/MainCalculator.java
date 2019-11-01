package creations.factory.simplefactory.examples.calculator;

/**
 * 计算机应用
 */
public class MainCalculator {
    /**
     * 从客户端的代码上可以看到，我们无需提供具体的子类类名，只需要提供一个字符串即可得到相应的实例对象。<br/>
     * 这样的话，当子类的类名更换或者增加子类时我们都无需修改客户端代码，只需要在简单工厂类上增加一个分支判断代码即可。
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Calculator add = CalculatorFactory.createCalculator("+");
        Calculator sub = CalculatorFactory.createCalculator("-");
        Calculator mul = CalculatorFactory.createCalculator("*");
        Calculator div = CalculatorFactory.createCalculator("/");

        System.out.println(add.getResult(6, 2));
        System.out.println(sub.getResult(6, 2));
        System.out.println(mul.getResult(6, 2));
        System.out.println(div.getResult(6, 2));
    }
}
