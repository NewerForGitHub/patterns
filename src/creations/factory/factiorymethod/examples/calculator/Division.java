package creations.factory.factiorymethod.examples.calculator;

/**
 * 除法计算器
 */
public class Division implements Calculator {
    @Override
    public int getResult(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("被除数不能为0");
        }
        return a / b;
    }
}
