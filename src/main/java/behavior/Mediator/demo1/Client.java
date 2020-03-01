package behavior.Mediator.demo1;

/**
 * @author wangguoqiang
 * @date 2020/3/1 11:37
 */
public class Client {
    public static void main(String[] args) {
        //中介者对象
        ConcreteWindow concreteWindow = new ConcreteWindow();

        //同事对象
        TextPane textPane = new TextPane();
        ListPane listPane = new ListPane();
        GraphicPane graphicPane = new GraphicPane();

        textPane.setWindow(concreteWindow);
        listPane.setWindow(concreteWindow);
        graphicPane.setWindow(concreteWindow);

        concreteWindow.graphicPane = graphicPane;
        concreteWindow.listPane = listPane;
        concreteWindow.textPane = textPane;

        textPane.addText("范闲");
        System.out.println("----------------");
        textPane.addText("庆帝");
        System.out.println("----------------");
        listPane.selectName("范闲");
    }
}
