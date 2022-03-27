package cn.jhh.strategyPattern;


/*
* 1.通过context选择策略并获得结果
* */
public class Context {
    static Strategy strategy;
    Context(){
        strategy = new StrategyA();
    }
    Context(String type){
        switch(type){
            case "A":
                strategy = new StrategyA();
                break;
            case "B":
                strategy = new StrategyB();
                break;
            case "C":
                strategy = new StrategyC();
                break;
            default:
                strategy = new StrategyA();
        }
    }
    public int applyStrategy(int before){
        return strategy.getRes(before);
    }
}
