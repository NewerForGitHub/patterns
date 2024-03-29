## **单例模式（Singleton Pattern）**
确保一个类只用一个实例，而且自行实例化并向整个系统提供该实例<br/>
Singleton Pattern:Ensure a class has only one instance,and provide a global point of access to it.<br/>
单例模式三元素：
<ol>
<li></li>
<li></li>
<li></li>
</ol>
优点：
<ol>
<li>减少内存开支，减少性能开销：单例，并且对象不会被重复创建、销毁</li>
<li>避免对资源的多重占用：避免重复读写等（要保证线程安全）</li>
<li>可在系统设置曲剧访问点，优化和共享资源访问（要保证线程安全）</li>
</ol>
缺点：
<ol>
<li>不能创建子类，扩展困难</li>
<li>妨碍mock，不方便单元测试</li>
<li>与单一职责原则冲突。既有单例的实现，又有业务逻辑</li>
</ol>

应用场景：
<ol>
<li>生成唯一序列号</li>
<li>全项目需要一个共享访问点或共享数据</li>
<li>创建对象的资源消耗较大时：如访问IO，数据库等</li>
<li>需要定义大量静态方法和静态常量时（一般常使用static）</li>
</ol>

注意事项：
<ol>
<li>有状态单例：通常当做状态库使用，一般都需要考虑线程安全问题</li>
<li>无状态单例：通常用于提供工具方法</li>
<li>在分布式环境中，尽量避免使用有状态单例</li>
<li>一个JVM中有多个类加载器时，尽量避免使用有状态单例</li>
</ol>

场景模拟：<br/>
王华购买了很多商品，商品快递过来的时间不相同。只能到一个快递，取一个快递。
在以上场景中，王华就是单例的，无论哪个快递来，都只能王华自己取快递

注意：<br/>
还有一种模式是多例模式，多例模式是单例模式的推广。连接池就属于这一类。
特点：
<ol>
<li>多例类有多个实例</li>
<li>多例类必须自己创建自己的实例，管理自己的实例并向外界共享自己的实例</li>
<li>根据是否有上限，分为有上限多例类和无上限多例类</li>
</ol>