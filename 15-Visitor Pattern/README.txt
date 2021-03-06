访问者模式
    1.定义: 将作用与某种数据结构中各元素的操作分离出来封装成独立的类,使其在不改变数据结构的前提下可以添加作用于这些元素的新的操作,
            为数据结构中的每个元素提供多种访问方式.
      优点: 扩展性好,灵活性高,复用性好,符合单一职责.
      缺点: 破坏封装,违反了依赖倒置职责.

    2.结构:
        (1) 抽象访问者. 定义一个访问具体元素的接口.
        (2) 具体访问者. 实现抽象访问者各个访问操作.
        (3) 抽象元素. 声名一个接受访问者的接口.
        (4) 具体元素. 实现抽象元素所提供的方法.
        (5) 对象结构角色. 是一个包含具体元素的容器,可以有将具体元素添加,删除的方法,以及将具体元素遍历出来的方法.

    3.使用场景:
        (1) 对象结构相对稳定,但其操作算法经常变化的程序.
        (2) 对象结构中的对象需要提供多种不同且不相关的操作，而且要避免让这些操作的变化影响对象的结构.
        (3) 对象结构包含很多类型的对象，希望对这些对象实施一些依赖于其具体类型的操作.