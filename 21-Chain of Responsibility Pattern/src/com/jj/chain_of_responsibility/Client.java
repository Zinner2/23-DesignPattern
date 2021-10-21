package com.jj.chain_of_responsibility;

/**
 * @author 张俊杰
 * @date 2021/10/20  - {TIME}
 */
public class Client {
    public static void main(String[] args) {
        PurchaseRequest request = new PurchaseRequest(1, 19000,1);


        Headmaster headmaster = new Headmaster("校长");
        Academician academician = new Academician("院长");
        Counselor counselor = new Counselor("辅导员");
        // 设置上一级
        counselor.setApprover(academician);
        academician.setApprover(headmaster);
        // 处理请求
        counselor.processRequest(request);

    }
}
