package cn.jhh.strategyPattern;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.Scanner;

public class Test {
    static void loop(){
        /**
         * 1.用户输入价格
         * 2.创建context，使用默认策略计算价格
         * */

        while(true){
            System.out.println("Welcome to jhh's demo!!!");
            System.out.println("输入q退出demo，输入其它任意字符继续。\t by jhh");
            Scanner scanner = new Scanner(System.in);
            if("q".equals(scanner.nextLine())) {
                scanner.close();
                return;
            }
            System.out.println("请输入原价");
            int before = scanner.nextInt();
            Context context = new Context("C");
            int after = context.applyStrategy(before);
            System.out.println("after:"+after);
            System.out.println();
            scanner.close();
        }
    }
    public static void main(String[] args) {
        loop();
    }
}
