package com.jj.chain_of_responsibility;

/**
 * 院长
 * @author 张俊杰
 * @date 2021/10/20  - {TIME}
 */
public class Academician extends Approver {

    public Academician(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getPrice() > 1000 && request.getPrice() <= 4000){
            System.out.println("请求编号 " +request.getId() + "被"+this.name+"处理");
        }else{
            approver.processRequest(request);
        }
    }
}
