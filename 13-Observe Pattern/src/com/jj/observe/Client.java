package com.jj.observe;

/**
 * @author 张俊杰
 * @date 2021/10/6  - {TIME}
 */
public class Client {
    public static void main(String[] args) {

        RmbRate rmbRate = new RmbRate();

        rmbRate.add(new ImportCompany());

        rmbRate.add(new ExportCompany());


        rmbRate.change(0.15);
    }
}
