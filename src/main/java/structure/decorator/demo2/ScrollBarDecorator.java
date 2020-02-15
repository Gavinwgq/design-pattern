package structure.decorator.demo2;

/**
 * @author wangguoqiang
 * @date 2020/2/15 15:50
 */
public class ScrollBarDecorator extends ComponentDecorator{
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar(){
        System.out.println("为构件增加滚动条");
    }
}
