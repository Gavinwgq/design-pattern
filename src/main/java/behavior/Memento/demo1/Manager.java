package behavior.Memento.demo1;

/**
 * @author wangguoqiang
 * @date 2020/3/3 20:23
 */
public class Manager {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
