package behavior.simplefactory.demo1;

public class Triangle implements Shape {
    public void draw() {
        System.out.println("绘制一个三角形");
    }

    public void erase() {
        System.out.println("擦除三角形");
    }
}
