package com.rudecrab.demo.common.designPattern.observer;

/**
 * @Description 粉丝
 * @Author liutianzi
 * @Date 2020/4/9 18:48
 * @Version 1.0
 **/
public class Fans implements Observer {

    FootballSubject footballSubject;
    String name;

    public Fans(FootballSubject footballSubject, String name) {
        this.footballSubject = footballSubject;
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + "在" + footballSubject.name +"听到" +footballSubject.starName + "说：" + message);
    }
    @Override
    public void subscribe() {
        footballSubject.subscribeObserver(this);
        System.out.println(name +"收看了" + footballSubject.name);

    }
    @Override
    public void unSubscribe() {
        footballSubject.unSubscribeObserver(this);
        System.out.println(name +"关闭了电视");

    }
}
