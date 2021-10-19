package com.jj.mediator;

/**
 * @author 张俊杰
 * @date 2021/10/19  - {TIME}
 */
public class Client {
    public static void main(String[] args) {
        // 创建中介者
        MediatorContract mediatorContract = new MediatorContract();
        // 创建房主
        HouseOwner jj = new HouseOwner("jj", mediatorContract);
        // 创建租客
        Tenant 小明 = new Tenant("小明", mediatorContract);

        mediatorContract.setHouseOwner(jj);
        mediatorContract.setTenant(小明);

        小明.constract("你好,我要一套豪华别墅 ");
        jj.constract("你好,一套别墅500万");
    }
}
