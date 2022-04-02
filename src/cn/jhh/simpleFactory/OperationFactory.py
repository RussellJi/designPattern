import re


class Operation:
    def getResult():
        pass

class AddOperation(Operation):
    def getResult(self,a,b):
        return a+b

class DivOperation(Operation):
    def getResult(self,a,b):
        res = 0;
        try:
            res = a/b
        except(Exception):
            print("被除数不能为0")
        return res;
class NoneOperation(Operation):
    def getResult(self):
        print("未知运算符")

class OperationFactory:

    operation = {}
    operation["+"] = AddOperation();
    operation["/"] = DivOperation();
    # 工厂根据运算符返回实例
    def getOperation(self,opt):
        if(opt in self.operation):
            return self.operation[opt]
        else:
            return NoneOperation()

def main():
    str = input("开始吧，请输入表达式:")
    num1 = re.match( r'^(\d+)', str).group(1)
    opt = re.match( r'^\d(.)\d$', str).group(1)
    num2 = re.match( r'^\d.(\d)$', str).group(1)
    print(num1,opt,num2)

    print(OperationFactory().getOperation(opt = opt).getResult(int(num1),int(num2)))


if __name__  == "__main__":
    main()

