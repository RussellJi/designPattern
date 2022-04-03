package cn.jhh.templatePattern;

public class Test {
    public static void main(String[] args) {
        TemplateClass templateClass;
        templateClass = new ConcreteClass1();
        templateClass.templateMethod();
        templateClass = new ConcreteClass2();
        templateClass.templateMethod();
    }
}
