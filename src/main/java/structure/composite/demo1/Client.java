package structure.composite.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/14 17:16
 */
public class Client {
    public static void main(String[] args) {
        Component c1 = new Button();
        Component c2 = new TextComponent();
        Window window = new Window();
        Panel panel = new Panel();
        panel.add(c1);
        panel.add(c2);
        window.add(panel);
        window.draw();

    }
}
