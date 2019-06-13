package com.cyd.project.design.patterns.create.builder;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 14:26
 * @ClassName Bike
 * @Version: 1.0
 */
public class Bike {
    /**
     * 车架
     */
    private String frame;
    /**
     * 车座
     */
    private String seat;
    /**
     * 车轮
     */
    private String tire;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frame='" + frame + '\'' +
                ", seat='" + seat + '\'' +
                ", tire='" + tire + '\'' +
                '}';
    }
}