package com.jj.observe;

/**
 * 出口公司实现类
 * @author 张俊杰
 * @date 2021/10/6  - {TIME}
 */
public class ExportCompany implements Company {

    @Override
    public void response(double number) {
        if (number > RmbRate.RMB_RATE){
            System.out.println("出口公司的出口产品收入降低且利润率降低");
        }else {
            System.out.println("出口公司的出口产品收入提升且利润率提升");
        }
    }
}
