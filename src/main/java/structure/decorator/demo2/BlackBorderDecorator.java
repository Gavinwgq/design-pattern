package structure.decorator.demo2;

/**
 * @author wangguoqiang
 * @date 2020/2/15 15:52
 */
public class BlackBorderDecorator extends ComponentDecorator{
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder(){
        System.out.println("为构件增加黑色边框");
    }
}
