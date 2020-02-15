package structure.decorator.demo2;

/**
 * @author wangguoqiang
 * @date 2020/2/15 15:49
 */
public class ComponentDecorator extends Component {
    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
