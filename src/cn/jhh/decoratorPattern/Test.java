package cn.jhh.decoratorPattern;


class Test{
    public static void main(String[] args) {
        Person jhh = new Person();
        DressComponent d = new Clothes(jhh);
        d = new Pant(d);
        d.dress();
    }
}