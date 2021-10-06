package com.jj.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * 人民币汇率实现类
 * @author 张俊杰
 * @date 2021/10/6  - {TIME}
 */
public class RmbRate implements Rate {

    List<Company> companyList = new ArrayList<>();


    /**
     * 当前 RMB 税率大小
     */
    public static final double RMB_RATE = 0.1552f;

    @Override
    public void add(Company company) {
        companyList.add(company);
    }

    @Override
    public void remove(Company company) {
        companyList.remove(company);
    }

    @Override
    public void change(double number) {
        for (Company company : companyList){
             company.response(number);
        }
    }
}
