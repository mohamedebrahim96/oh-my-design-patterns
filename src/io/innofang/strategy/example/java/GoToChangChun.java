package io.innofang.strategy.example.java;

/**
 * Created by Inno Fang on 2017/3/3.
 */
public class GoToChangChun implements GoToStrategy {
    @Override
    public void transportation() {
        System.out.println("take plane");
    }
}
