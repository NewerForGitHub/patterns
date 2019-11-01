package creations.factory.factiorymethod.examples.calculator;

/**
 * 计算器抽象工厂类
 */
public interface CalculatorFactory {
    /**
     * 获取具体工厂类
     *
     * @return
     */
    Calculator createCalculator();
}
