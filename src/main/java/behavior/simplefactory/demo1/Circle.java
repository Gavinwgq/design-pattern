package behavior.simplefactory.demo1;

public class Circle implements Shape {

    public void draw() {
        System.out.println("绘制一个圆形");
    }

    public void erase() {
        System.out.println("擦除圆形");
    }
}
