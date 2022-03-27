package cn.jhh.strategyPattern;

public class StrategyC implements Strategy{
    @Override
    public int getRes(int before) {
        return before + 2;
    }
}
