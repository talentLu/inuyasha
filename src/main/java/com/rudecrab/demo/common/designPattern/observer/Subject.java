package com.rudecrab.demo.common.designPattern.observer;

/**
 * @Description 主题
 * @Author liutianzi
 * @Date 2020/4/9 18:43
 * @Version 1.0
 **/
public interface Subject {
    //增加通知对象
    void subscribeObserver(Observer observer);
    //取消通知对象
    void unSubscribeObserver(Observer observer);
    //通知观察者
    void notifyObservers(String message);

}
