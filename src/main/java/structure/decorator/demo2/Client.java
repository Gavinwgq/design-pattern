package structure.decorator.demo2;

/**
 * @author wangguoqiang
 * @date 2020/2/15 15:54
 */
public class Client {
    public static void main(String[] args) {
        Component component,componentSB,componentBB;
        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentBB = new BlackBorderDecorator(componentSB);
        componentBB.display();
    }
}
