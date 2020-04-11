package com.rudecrab.demo.common.designPattern.abstractFactory;

import lombok.Data;

/**
 * @Description TODO
 * @Author liutianzi
 * @Date 2020/4/11 18:32
 * @Version 1.0
 **/
@Data
public class Computer {
    Keyboard keyboard;
    Mouse mouse;

    public Computer() {
    }
}
