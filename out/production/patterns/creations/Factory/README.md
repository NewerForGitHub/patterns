## **工厂模式（Factory Pattern）**
Factory Pattern:<br/>
Define an interface for creating an object, but let subclasses decide which class to instance.Factory Method lets a class defer instantiation to subclasses.<br/>
工厂模式：<br/>
定义一个用于创建对象的接口，让子类决定实例化哪个类。工厂方法使一个类的实例化延迟到子类。<br/>
</p>
工厂模式分类：
<ol>
<li>
简单工厂模式
<p>
工厂类处于对产品类实例化的中心位置，它知道每一个产品，它决定应该实例化哪个产品类。
<ul>
<li>优点：允许客户端相对独立于产品的创建过程，新增产品时也无需修改客户端代码。某种程度上支持了“开-闭”原则</li>
<li>缺点：对“开-闭”原则的支持力度不够，新增或删除产品时，需要修改工厂类代码，添加必要的逻辑。</li>
</ul>
</p>
</li>
<li>
工厂方法模式：简单工厂的进一步抽象和推广
<p>
具有多态性。该模式中，核心类不再负责工厂类的创建，而是由子类去完成。核心类抽象成一个接口，只定义工厂类所必须实现的方法即可。这样做可以允许系统在不修改具体工厂角色的情况下，引入新的产品，这一点比简单工厂模式更具优越性。
</p>
</li>
<li>
抽象工厂模式
<p>所有工厂模式中最具抽象和最具有一般性的一种形态。</p>
<p>和工厂方法模式的区别是，工厂方法模式是面对一个产品等级结构，抽象工厂模式则面对多个产品等级结构。</p>
</li>
</ol>