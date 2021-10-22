package com.jj.Strategy;

/**
 * @author 张俊杰
 * @date 2021/10/22  - {TIME}
 */
public class SalesMan {

    private Discount discount;

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void showDiscount() {
        if (discount != null) {
            discount.show();
        }
    }
}
