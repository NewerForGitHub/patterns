package creations.factory.factiorymethod.examples.calculator;

/**
 * 计算机应用
 */
public class MainCalculator {
    /**
     * 从代码可以看到，工厂方法模式看起来要比起简单工厂复杂很多<br/>
     * 但简单工厂方法耦合性过高，不适用于较大的项目里。
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
//        使用反射机制实例化工厂对象，因为字符串是可以通过变量改变的
//        CalculatorFactory addFactory = new AdditionFactory();
        CalculatorFactory addFactory = (CalculatorFactory) Class.forName(
            "creations.factory.factiorymethod.examples.calculator.AdditionFactory")
            .newInstance();
//        CalculatorFactory subFactory = new SubtractionFactory();
        CalculatorFactory subFactory = (CalculatorFactory) Class.forName(
            "creations.factory.factiorymethod.examples.calculator.SubtractionFactory")
            .newInstance();
//        CalculatorFactory mulFactory = new MultiplicationFactory();
        CalculatorFactory mulFactory = (CalculatorFactory) Class.forName(
            "creations.factory.factiorymethod.examples.calculator.MultiplicationFactory")
            .newInstance();
//        CalculatorFactory divFactory = new DivisionFactory();
        CalculatorFactory divFactory = (CalculatorFactory) Class.forName(
            "creations.factory.factiorymethod.examples.calculator.DivisionFactory")
            .newInstance();

//        通过工厂对象创建相应的实例对象
        Calculator add = addFactory.createCalculator();
        Calculator sub = subFactory.createCalculator();
        Calculator mul = mulFactory.createCalculator();
        Calculator div = divFactory.createCalculator();

        System.out.println(add.getResult(6, 2));
        System.out.println(sub.getResult(6, 2));
        System.out.println(mul.getResult(6, 2));
        System.out.println(div.getResult(6, 2));
    }
}
