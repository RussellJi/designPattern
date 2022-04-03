package cn.jhh.templatePattern;

public abstract class TemplateClass{
    public void templateMethod(){
        concreteMethod1();
        concreteMethod2();
    }
    public abstract void concreteMethod1();
    public abstract void concreteMethod2();
}

class ConcreteClass1 extends TemplateClass{
    public void concreteMethod1(){
        System.out.println("class1 method1");
    }
    public void concreteMethod2(){
        System.out.println("class1 method2");
    }
}

class ConcreteClass2 extends TemplateClass{
    public void concreteMethod1(){
        System.out.println("class2 method1");
    }
    public void concreteMethod2(){
        System.out.println("class2 method2");
    }
}

