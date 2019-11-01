package creations.factory.factiorymethod.examples.calculator;

/**
 * 计算器抽象工厂类
 */
public class DivisionFactory implements CalculatorFactory {
    /**
     * 获取具体工厂类-除法工厂类
     *
     * @return
     */
    @Override
    public Calculator createCalculator() {
        return new Division();
    }
}
