DesignPattern
====
设计模式Demo



Singleton 单例模式
------
GOF：确保每个类只有一个实例，并提供它的全局访问点。

###适用性
  当类只能有一个实例而且客户可以从一个中所周知的访问点访问它时。

Birdge 桥接模式
------
GOF：将抽象部分与实现部分分离，使他们都可以独立的变化。
在软件系统中，某些类型由于自身的逻辑，它具有两个或多个维度的变化，那么如何应对这种“多维度的变化”？如何利用面向对象的技术来使得该类型能够轻松的沿着多个方向进行变化，而又不引入额外的复杂度？这就要使用Bridge模式。

###效果及实现要点
  1.Bridge模式使用"对象间的组合关系“解耦了抽象和实现之间固有的绑定关系，使得抽象和实现可以沿着各自的维度来变化。
  
  2.所谓抽象和实现沿着各自维度的变化，即”子类“他们，得到各个子类之后，便可以任意使用，从而获得不同路上的不同汽车。
  
  3.Bridge模式有时候类似于多继承方案，但是多继承方案往往违背了类的单一职责原则（即一个类只有一个变化的原因），复用性比较差。Bridge模式是比多继承方案更好的解决方法。
  
  4.Bridge模式的应用一般在”两个非常强的变化维度“，有时候即使有两个变化的维度，但是某个方向的变化维度并不剧烈——换言之，两个变化不会导致纵横交错的结果，并不一定要使用Bridge模式。
  
###适用性
  1.如果在系统需要在构件的抽象画角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的联系。
  
  2.设计要求实现角色的任何改变不应当影响客户端，或者说实现化角色的改变对客户端是完全透明的。
  
  3.一个构件有多余一个的抽象化角色和实现化角色，系统需要它们之间进行动态耦合。
  
  4.虽然在系统中使用继承是美欧问题的，但是由于抽象画角色和具体化角色需要独立变化，设计要求需要独立管理这两者。
  
  总结：Bridge模式是一个非常有用的模式，也非常复杂，它很好的符合了开放-封闭原则和优先使用对象，而不是继承这两个面向对象原则
  
###桥接模式和装饰模式的区别：
  这两个模式在一定程度上都是为了减少子类的数目，避免出现复杂的继承关系。但是他们解决的方法却各有不同，装饰模式把子类中比基类中多出来的部分放到单独的类里面，以适应新功能增加的需要，当我们把描述新功能的类封装到基类的对象里面时，就得到了所需要的子类对象，这些描述新功能的类通过组合可以实现很多的功能组合。桥接模式则把原来的基类的实现化细节抽象出来，在构造到一个实现化的结构中，然后再把原来的基类改造成一个抽象化的等级结构，这样就可以实现系统在多个维度上的独立变化。
  
Proxy 代理模式
------
为其他对象提供一种代理以控制对这个对象的访问。在某些情况下，一个对象不适合或者不能直接引用另一个对象，而代理对象可以在客户端和目标对象之间起到中介的作用

###组成
  1.抽象角色：通过接口或者抽象类声明真实角色实现的业务方法
  
  2.代理角色：实现抽象角色，是真实角色的代理，通过真实角色的业务逻辑方法来实现抽象方法，并可以附加自己的操作。
  
  3.真实角色：实现抽象角色，定义真实角色所要实现的业务漏记，供代理角色调用。
  
###优点：
  1.职责清晰：真实的角色就是现实实际的业务逻辑，不用关心其他非本职责的事务，通过后期的代理完成一件事务，附带的结果就是编程简洁清晰
  
  2.代理对象可以在客户端和目标对象之间起到中介作用，这样起到了中介的作用和保护了目标对象的作用
  
  3.高扩展性
  
###模式结构
  一个是真正的你要访问的对象（目标类），一个是代理对象，目标对象和代理对象实现同一个接口，先访问代理对象在访问真正要访问的目标对象。

Prototype 原型模式
-------
允许对象在不了解要创建对象的确切类以及如何创建等细节的情况下创建自定义对象。使用Prototype实例，便指定了要创建的对象类型，而通过复制这个Prototype,就可以创建新的对象。Prototype模式是通过先给出一个对象的Prototype对象，然后再初始化对象的创建。
创建初始化后的对象再通过Prototype对其自身进行复制来创建其他对象。Prototype模式使得动态创建对象更加简单，只能讲对象类定义成能够复制自身就可以实现。

###其优点如下

  1.可以在运行时添加或删除产品
  
  2.通过改变值指定新对象
  
  3.通过改变结构指定新对象
  
  4.减少子类的生成和使用
  
  5.可以用类动态地配置应用程序
  
###应用场景：

  1.在运行时，指定需要实例化的类，例如动态载入
  
  2.避免构建与产品的类层次结构相似和工厂类层次结构
  
  3.当类的实例是仅有的一些不同状态组合之一的时候

Iterator   迭代器模式，又叫游标模式
-------
GOF：提供一种方法访问一个容器对象中的各个元素，而又不需暴露该对象的内部细节。

从定义中可以见，迭代器是为容器而生的，很明显，对容器对象的访问必然涉及到遍历算法。

一种方式是一股脑将遍历方法塞到容器对象中去，第二种方式是让使用容器的人自己去实现。

第一种方式，容器承受了过多的功能，它不仅要负责自己容器内的元素维护（如添加、删除等），而且还要提供遍历自身的接口；而且由于遍历状态保存的问题，不能对同一个容器对象同时进行多个遍历。

第二种方式，省事，却又将容器的内部细节暴露无遗。

而迭代器模式的出现，很好的解决了上面两种情况的极端。

###迭代器模式有以下角色：

  1.迭代器角色（Iterator):迭代器角色负责定义访问和遍历元素的接口
  
  2.具体迭代器角色（Concrete Iterator):具体迭代器角色要实现迭代器接口，并要记录遍历中的当前位置。
  
  3.容器角色（Container):容器角色负责提供创建具体迭代器角色的接口。
  
  4.具体容器角色（Concrete Container):具体容器角色实现创建具体迭代器角色的接口——这个具体迭代器角色与该容器的结构相关。
  
###迭代器的作用：

  1.支持以不同的方式遍历一个耦合复杂的聚合，可用多种方式进行遍历，如二叉树的遍历，可以采用先序、后序、中序遍历。迭代器模式使得改变遍历算法变得容易：仅需要用一个不同的迭代器的实例代替原先的实例即可，你也可以定义迭代器的子类以支持新的遍历，或者可以在遍历中增加一些逻辑，如有条件的遍历等。
  
  2.迭代器简化了聚合的接口，有了迭代器的遍历接口，聚合本身就不在需要类似的遍历接口了，这样就简化了聚合的接口。
  
  3.在同一个聚合上，可以有多个遍历，每个迭代器保持它自己的遍历状态，因此你可以同时进行多个遍历。
  
  4.可以为遍历不同的聚合结构（需拥有相同的基类）提供一个统一的接口，即支持多态迭代。
  
