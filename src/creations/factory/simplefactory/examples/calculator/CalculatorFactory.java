package creations.factory.simplefactory.examples.calculator;

/**
 * 简单工厂类
 */
public class CalculatorFactory {
    /**
     * 获取实例类
     * 
     * @param name
     *        需要指明需要的特性
     * @return
     */
    public static Calculator createCalculator(String name) {
        if (name == null) {
            return null;
        }
        switch (name) {
            case "+":
                return new Addition();
            case "-":
                return new Subtraction();
            case "*":
                return new Multiplication();
            case "/":
                return new Division();
            default:
                return null;
        }
    }
}
