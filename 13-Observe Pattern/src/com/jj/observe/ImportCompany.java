package com.jj.observe;

/**
 * 进口公司实现类
 * @author 张俊杰
 * @date 2021/10/6  - {TIME}
 */
public class ImportCompany implements Company {

    @Override
    public void response(double number) {
        if (number > RmbRate.RMB_RATE){
            System.out.println("进口公司的进口产品成本降低且利润率提升");
        }else {
            System.out.println("进口公司的进口产品成本提升且利润率降低");
        }
    }
}
