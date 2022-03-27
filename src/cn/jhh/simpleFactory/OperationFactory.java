package cn.jhh.simpleFactory;

public class OperationFactory {

    public static Operation getOperation(String operator){
        Operation operation;
        switch(operator){
            case "+":
                operation =  new Add();
                break;
            case "/":
                operation = new div();
                break;
            default:
                operation = null;
        }
        return operation;
    }



}


