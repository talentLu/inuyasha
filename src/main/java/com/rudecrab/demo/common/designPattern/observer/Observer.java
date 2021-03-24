package com.rudecrab.demo.common.designPattern.observer;

/**
 * @Description 观察者
 * @Author liutianzi
 * @Date 2020/4/9 18:40
 * @Version 1.0
 **/
public interface Observer {
    //接受通知
    void update(String message);
    //订阅主题
    void subscribe();
    //取消订阅
    void unSubscribe();

}
