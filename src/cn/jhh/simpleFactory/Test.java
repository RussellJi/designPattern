package cn.jhh.simpleFactory;

import java.util.Scanner;

public class Test {
    static void cal(){
        while(true){
            System.out.println("Welcome to jhh's demo!!!");
            System.out.println("输入q退出计算器，输入其它任意字符继续。\t by jhh");
            Scanner scanner = new Scanner(System.in);
            if("q".equals(scanner.nextLine()) ) {
                scanner.close();
                return;
            }
            System.out.println("请输入第一个操作数：");
            int num1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("请输入运算符：");
            String operator = scanner.nextLine();
            System.out.println("请输入第二个操作数：");
            int num2 = scanner.nextInt();

            System.out.println("结果为："+ OperationFactory.getOperation(operator).getRes(num1,num2)+"\n");
            scanner.close();
        }

    }
    public static void main(String[] args) {
        cal();
    }
}
