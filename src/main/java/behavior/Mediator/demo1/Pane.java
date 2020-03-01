package behavior.Mediator.demo1;

/**
 * @author wangguoqiang
 * @date 2020/3/1 10:53
 */
public abstract class Pane {
    protected Window window;

    public void setWindow(Window window) {
        this.window = window;
    }

    public void change(){
        window.paneChanged(this);
    }
}
