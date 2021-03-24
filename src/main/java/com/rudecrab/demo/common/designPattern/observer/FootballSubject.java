package com.rudecrab.demo.common.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

;

/**
 * @Description TODO
 * @Author liutianzi
 * @Date 2020/4/9 18:47
 * @Version 1.0
 **/
public class FootballSubject implements Subject, Star {

    List<Observer> observers = new ArrayList<>(16);

    String starName;

    String name;

    public FootballSubject(String starName, String name) {
        this.starName = starName;
        this.name = name;
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        observers.stream().forEach((observer)->{
            observer.update(message);
        });
    }

    @Override
    public void say(String message) {
        notifyObservers(message);
    }
}
