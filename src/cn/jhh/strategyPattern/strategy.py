class Strategy:
    def getResult(self,brefore):
        pass

class StrategyA(Strategy):
    def getResult(self,before):
        return before
class StrategyB(Strategy):
    def getResult(self,before):
        return before + 1
class StrategyC(Strategy):
    def getResult(self,before):
        return before + 2

class Context:
    strategies = {}
    strategies["A"] = StrategyA()
    strategies["B"] = StrategyB()
    strategies["C"] = StrategyC()
    strategy = None
    def __init__(self,opt="A"):  # 默认为策略A
        if(opt in self.strategies):
            self.strategy = self.strategies[opt]
        else:
             self.strategy = self.strategies["A"]
    def getResult(self,before):
        return self.strategy.getResult(before)

def main():
    print(Context("B").getResult(int(input("请输入原价："))))

if __name__ == "__main__":
    main()