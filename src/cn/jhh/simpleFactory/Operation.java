package cn.jhh.simpleFactory;


/**
 * 属性：num1与num2
 * */
public class Operation {

    private int res = 0;
    public int getRes(int num1,int num2){
        return res;
    }
}

class Add extends Operation{
    @Override
    public int getRes(int num1,int num2) {
        return num1 + num2;
    }
}
class div extends Operation{
    @Override
    public int getRes(int num1,int num2) {
        int i = 0;
        try{
            if(num2 == 0){
                throw new RuntimeException("输入有误");
            }
        }catch(Exception e){
            i = 0;
        }
        return i;
    }
}


