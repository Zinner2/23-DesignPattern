package com.jj.chain_of_responsibility;

/**
 * @author 张俊杰
 * @date 2021/10/20  - {TIME}
 */
public class Headmaster extends Approver {

    public Headmaster(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getPrice() > 4000 && request.getPrice() < 10000){
            System.out.println("请求编号 " +request.getId() + "被"+this.name+"处理");
        }else{
            System.out.println("");
        }
    }
}
