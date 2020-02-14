package structure.composite.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/14 17:08
 */
public class TextComponent extends Component {
    @Override
    public void draw() {
        System.out.println("绘制一个文本框");
    }
}
