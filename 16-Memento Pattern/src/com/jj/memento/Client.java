package com.jj.memento;

/**
 * @author 张俊杰
 * @date 2021/10/16  - {TIME}
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("---- 大战boss前 ----");
        RoleMementoPool roleMemento = new RoleMementoPool();
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();
        roleMemento.add("大战boss前",gameRole.saveState());
        System.out.println(gameRole.saveState());

        System.out.println("---- 第一次战斗后 ----");
        gameRole.fight(90,90,90);
        gameRole.stateDisplay();
        roleMemento.add("第一次战斗后",gameRole.saveState());


        System.out.println("---- 第二次战斗后 ----");
        gameRole.fight(60,60,60);
        gameRole.stateDisplay();
        roleMemento.add("第二次战斗后",gameRole.saveState());


        System.out.println("---- 第三次战斗后 ----");
        gameRole.fight(30,20,20);
        gameRole.stateDisplay();
        roleMemento.add("第三次战斗后",gameRole.saveState());

        System.out.println("---- 恢复第二次战斗后 ----");
        gameRole.recoverState(roleMemento.get("第二次战斗后"));
        gameRole.stateDisplay();
    }
}
