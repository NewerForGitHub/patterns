package creations.factory.simplefactory.examples.calculator;

/**
 * 乘法计算器
 */
public class Multiplication implements Calculator {
    @Override
    public int getResult(int a, int b) {
        return a * b;
    }
}
