package behavior.Mediator.demo1;

/**
 * @author wangguoqiang
 * @date 2020/3/1 10:55
 */
public class ConcreteWindow extends Window {
    public TextPane textPane;
    public ListPane listPane;
    public GraphicPane graphicPane;

    @Override
    public void paneChanged(Pane pane) {
        if(textPane == pane){
            listPane.addNameList(textPane.getName());
            graphicPane.display(textPane.getName());
        }else if(listPane == pane){
            graphicPane.display(listPane.getName());
        }
    }
}
