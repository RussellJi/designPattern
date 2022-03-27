package cn.jhh.strategyPattern;

public class StrategyB implements Strategy{
    @Override
    public int getRes(int before) {
        return before + 1;
    }
}
