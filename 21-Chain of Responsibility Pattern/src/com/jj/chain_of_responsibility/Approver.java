package com.jj.chain_of_responsibility;

/**
 * @author 张俊杰
 * @date 2021/10/20  - {TIME}
 */
public abstract class Approver {
    Approver approver;
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public Approver getApprover() {
        return approver;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    /**
     *
     * 处理请求
     * @param request
     */
    public abstract void processRequest(PurchaseRequest request);
}
