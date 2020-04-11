package com.rudecrab.demo.common.designPattern.factory;

public interface Factory {
    Car create(String car);

    Car createBMW();

    Car createBAOMA();

}
