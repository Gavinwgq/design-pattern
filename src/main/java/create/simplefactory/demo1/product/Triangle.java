package create.simplefactory.demo1.product;

public class Triangle implements Shape {
    public void draw() {
        System.out.println("绘制一个三角形");
    }

    public void erase() {
        System.out.println("擦除三角形");
    }
}
