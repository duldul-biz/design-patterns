package com.cyd.project.design.patterns.behavior.mediator;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/13 11:39
 * @ClassName MediatorStructure
 * @Version: 1.0
 */
public class MediatorStructure implements Mediator {
    //首先中介结构必须知道所有房主和租房者的信息
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
    public void doSomeThing(String message, Person person) {
        if(person == houseOwner){
            houseOwner.doSomeThing(message);
        }else {
            tenant.doSomeThing(message);
        }
    }
}
