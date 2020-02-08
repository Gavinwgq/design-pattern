package create.simplefactory.demo1.product;

public class Square implements Shape {
    public void draw() {
        System.out.println("绘制一个正方形");
    }

    public void erase() {
        System.out.println("擦除正方形");
    }
}
