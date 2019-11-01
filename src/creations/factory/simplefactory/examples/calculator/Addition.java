package creations.factory.simplefactory.examples.calculator;

/**
 * 加法计算器
 */
public class Addition implements Calculator {
    @Override
    public int getResult(int a, int b) {
        return a + b;
    }
}
