模板方法模式:
       1.定义:
            职定义一个操作中的算法骨架,而将算法的一些步骤延迟到子类中,
            使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤.

       2.结构:
            (A)抽象类（Abstract Class）：负责给出一个算法的轮廓和骨架。它由一个模板方法和若干个基本方法构成.
            (B)模板方法：定义了算法的骨架，按某种顺序调用其包含的基本方法.
            (C)基本方法：是实现算法各个步骤的方法，是模板方法的组成部分。基本方法又可以分为三种.
            (D)抽象方法(Abstract Method) ：一个抽象方法由抽象类声明、由其具体子类实现.
            (E)具体方法(Concrete Method) ：一个具体方法由一个抽象类或具体类声明并实现，其子类可以进行覆盖也可以直接继承.
            (F)钩子方法(Hook Method) ：在抽象类中已经实现，包括用于判断的逻辑方法和需要子类重写的空方法两种.
            一般钩子方法是用于判断的逻辑方法，这类方法名一般为isXxx，返回值类型为boolean类型.
            (G)具体子类（Concrete Class）：实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的组成步骤.

       3.使用场景:
            a.算法的整体步骤很固定，但其中个别部分易变时，这时候可以使用模板方法模式，将容易变的部分抽象出来，供子类实现.
            b.需要通过子类来决定父类算法中某个步骤是否执行，实现子类对父类的反向控制.