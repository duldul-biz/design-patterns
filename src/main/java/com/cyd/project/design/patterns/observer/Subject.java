package com.cyd.project.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/12 14:47
 * @ClassName Subject
 * @Version: 1.0
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public void iNotify(String message){
        observers.forEach(s->s.update(message));
    }
}
