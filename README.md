# 23-设计模式 DesignPattern
23种设计模式
## 01-单例模式 Singleton Pattern
### A.恶汉模式(推荐使用)
创建步骤:</br>
  1.构造方法私有化</br>
  2.在类的内部创建对象</br>
  3.向外界暴露一个静态的公共方法</br>
   <a href="https://github.com/Zinner2/23-DesignPattern/tree/master/01-Singleton%20Pattern/src/com/jj/hungryman">具体请看代码</a></br>
缺点:类装载时完成实例化,如果该实例未使用,可能造成内存浪费。

### B.静态代码块(推荐使用)
创建步骤:</br>
  1.构造方法私有化</br>
  2.在静态代码块内创建对象</br>
  3.向外界暴露一个静态的公共方法</br>
   <a href="https://github.com/Zinner2/23-DesignPattern/tree/master/01-Singleton%20Pattern/src/com/jj/staticblock">具体请看代码</a></br>
缺点:静态代码块只运行一次,如果该实例未使用,可能造成内存浪费。

### C.懒汉模式(不推荐使用)
创建步骤:</br>
  1.构造方法私有化</br>
  2.定义本类常量</br>
  3.向外界暴露一个静态的公共方法</br>
  <a href="https://github.com/Zinner2/23-DesignPattern/tree/master/01-Singleton%20Pattern/src/com/jj/lazyman">具体请看代码</a></br>
缺点:多线程模式下,可能会产生多个实例。

### D.同步锁(不推荐使用)
创建步骤:</br>
  1.构造方法私有化</br>
  2.定义本类常量</br>
  3.向外界暴露一个静态的公共方法</br>
  <a href="https://github.com/Zinner2/23-DesignPattern/tree/master/01-Singleton%20Pattern/src/com/jj/synchronouslock">具体请看代码</a></br>
缺点:性能不好。
### E.双重检查(推荐使用)
  创建步骤:</br>
  1.构造方法私有化</br>
  2.定义本类常量</br>
  3.向外界暴露一个静态的公共方法</br>
  <a href="https://github.com/Zinner2/23-DesignPattern/tree/master/01-Singleton%20Pattern/src/com/jj/doublecheck">具体请看代码</a></br>
### F.内部类(推荐使用)
创建步骤:</br>
  1.构造方法私有化</br>
  2.定义静态内部类</br>
  3.向外界暴露一个静态的公共方法</br>
  <a href="https://github.com/Zinner2/23-DesignPattern/tree/master/01-Singleton%20Pattern/src/com/jj/innerclass">具体请看代码</a></br>
缺点:性能不好。
## 02-原型模式 Prototype Pattern

## 03-建造者模式 Builder Pattern

## 04-简单工厂 Simple Factory

## 05-工厂方法 Factory Method

## 06-抽象工厂 Abstract Factory
