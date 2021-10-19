package com.jj.mediator;

/**
 * @author 张俊杰
 * @date 2021/10/19  - {TIME}
 */
public class MediatorContract extends Mediator {

    private HouseOwner houseOwner;

    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void constract(String message, Person person) {
        if (person == houseOwner) {
            tenant.getMessage(message);
        }else{
            houseOwner.getMessage(message);
        }
    }
}
