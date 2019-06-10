package com.cyd.project.design.patterns.bridge;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 17:40
 * @ClassName Driver
 * @Version: 1.0
 */
public class Driver {
    private DriverSource driverSource;

    public void driver(){
        driverSource.driver();
    }

    public DriverSource getDriverSource() {
        return driverSource;
    }

    public void setDriverSource(DriverSource driverSource) {
        this.driverSource = driverSource;
    }
}
