package cn.jhh.proxyPattern;

public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("real request");
    }
    
}
