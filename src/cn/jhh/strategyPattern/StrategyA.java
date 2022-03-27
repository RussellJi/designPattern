package cn.jhh.strategyPattern;

public class StrategyA implements Strategy{
    @Override
    public int getRes(int before) {
        return before;
    }
}
