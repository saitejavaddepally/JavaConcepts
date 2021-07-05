package Oops.Inheritance;


class Amoeba extends Shape{
    @Override
    void playSound() {
        super.playSound();
        int result=  super.x;
        System.out.println("I accessed it from child class " + result);
        System.out.println("I sound differently other than parent");
    }

    @Override
    protected void rotate(int x){
        System.out.println("I rotate differently other that parent");
    }
}