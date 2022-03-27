package cn.jhh.decoratorPattern;

public class Decorator extends DressComponent{
    protected DressComponent dressComponent;
    // public void setComponent(DressComponent dressComponent){
    //     this.dressComponent = dressComponent;
    // }
    Decorator(DressComponent dressComponent){
        this.dressComponent = dressComponent;
    }
    @Override
    public void dress(){
        if(dressComponent != null){
            dressComponent.dress();
        }
    }
}

class Clothes extends Decorator{
    Clothes(DressComponent dressComponent) {
        super(dressComponent);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void dress(){
        super.dress();
        addClothes();
    }
    public void addClothes(){
        System.out.println("衣服");
    }


}

class Pant extends Decorator{
    Pant(DressComponent dressComponent) {
        super(dressComponent);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void dress(){
        super.dress();
        addPant();
    }
    public void addPant(){
        System.out.println("裤子");
    }

}

