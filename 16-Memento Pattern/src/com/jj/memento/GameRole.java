package com.jj.memento;

/**
 * 游戏角色
 * @author 张俊杰
 * @date 2021/10/16  - {TIME}
 */
public class GameRole {

    /**
     * 攻击力
     */
    private int atc;
    /**
     * 生命力
     */
    private int vit;
    /**
     * 防御力
     */
    private int def;

    public int getAtc() {
        return atc;
    }

    public void setAtc(int atc) {
        this.atc = atc;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    /**
     * 初始化战斗状态
     */
    public void initState(){
        this.atc = 100;
        this.vit = 100;
        this.def = 100;
    }
    /**
     * 开始战斗
     * @param atc
     * @param vit
     * @param def
     */
    public void fight(int atc,int vit,int def){
        this.atc = atc;
        this.vit = vit;
        this.def = def;
    }

    /**
     * 保存角色状态功能
     * @return
     */
    public Memento saveState(){
        return new RoleMemento(atc,vit,def);
    }

    /**
     * 恢复角色状态
     * @param memento
     */
    public void recoverState(Memento memento){
        RoleMemento roleMemento = (RoleMemento) memento;
        this.atc = roleMemento.atc;
        this.vit = roleMemento.vit;
        this.def = roleMemento.def;
    }

    /**
     * 展示角色状态
     */
    public void stateDisplay(){
        System.out.println("角色攻击力"+atc);
        System.out.println("角色生命力"+vit);
        System.out.println("角色防御力"+def);
    }
    static class RoleMemento implements Memento {
        /**
         * 攻击力
         */
        private int atc;
        /**
         * 生命力
         */
        private int vit;
        /**
         * 防御力
         */
        private int def;

        public RoleMemento(int atc, int vit, int def) {
            this.atc = atc;
            this.vit = vit;
            this.def = def;
        }

        public RoleMemento() {
        }

        public int getAtc() {
            return atc;
        }

        public void setAtc(int atc) {
            this.atc = atc;
        }

        public int getVit() {
            return vit;
        }

        public void setVit(int vit) {
            this.vit = vit;
        }

        public int getDef() {
            return def;
        }

        public void setDef(int def) {
            this.def = def;
        }
    }
}
