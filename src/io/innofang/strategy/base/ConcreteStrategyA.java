package io.innofang.strategy.base;

/**
 * Created by Inno Fang on 2017/5/8.
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Execute by strategy a");
    }
}
