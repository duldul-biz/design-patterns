package com.cyd.project.design.patterns.structure.composite;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/11 10:02
 * @ClassName OutputInfo
 * @Version: 1.0
 */
public class OutputInfo {
    Organization allOrganization;

    public OutputInfo(Organization allOrganization) {
        this.allOrganization = allOrganization;
    }

    public void printOrganization(){
        allOrganization.print();
    }
}
