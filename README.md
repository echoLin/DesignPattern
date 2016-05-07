# DesignPattern
设计模式Demo

##Iterator
#迭代器模式，又叫游标模式
GOF：提供一种方法访问一个容器对象中的各个元素，而又不需暴露该对象的内部细节。
从定义中可以见，迭代器是为容器而生的，很明显，对容器对象的访问必然涉及到遍历算法。
一种方式是一股脑将遍历方法塞到容器对象中去，第二种方式是让使用容器的人自己去实现。
第一种方式，容器承受了过多的功能，它不仅要负责自己容器内的元素维护（如添加、删除等），而且还要提供遍历自身的接口；而且由于遍历状态保存的问题，不能对同一个容器对象同时进行多个遍历。
第二种方式，省事，却又将容器的内部细节暴露无遗。
而迭代器模式的出现，很好的解决了上面两种情况的极端。
迭代器模式有以下角色：
  1.迭代器角色（Iterator):迭代器角色负责定义访问和遍历元素的接口
  2.具体迭代器角色（Concrete Iterator):具体迭代器角色要实现迭代器接口，并要记录遍历中的当前位置。
  3.容器角色（Container):容器角色负责提供创建具体迭代器角色的接口。
  4.具体容器角色（Concrete Container):具体容器角色实现创建具体迭代器角色的接口——这个具体迭代器角色与该容器的结构相关。
迭代器的作用：
  1.支持以不同的方式遍历一个耦合复杂的聚合，可用多种方式进行遍历，如二叉树的遍历，可以采用先序、后序、中序遍历。迭代器模式使得改变遍历算法变得容易：仅需要用一个不同的迭代器的实例代替原先的实例即可，你也可以定义迭代器的子类以支持新的遍历，或者可以在遍历中增加一些逻辑，如有条件的遍历等。
  2.迭代器简化了聚合的接口，有了迭代器的遍历接口，聚合本身就不在需要类似的遍历接口了，这样就简化了聚合的接口。
  3.在同一个聚合上，可以有多个遍历，每个迭代器保持它自己的遍历状态，因此你可以同时进行多个遍历。
  4.可以为遍历不同的聚合结构（需拥有相同的基类）提供一个统一的接口，即支持多态迭代。
