package cn.jhh.proxyPattern;
class Proxy implements Subject{
    RealSubject realSubject;
    @Override
    public void request() {
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }

    public static void main(String[] args) {
       Proxy proxy = new Proxy();
       proxy.request();
    }
}