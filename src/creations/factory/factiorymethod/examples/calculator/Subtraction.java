package creations.factory.factiorymethod.examples.calculator;

/**
 * 减法计算器
 */
public class Subtraction implements Calculator {
    @Override
    public int getResult(int a, int b) {
        return a - b;
    }
}
