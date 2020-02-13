package structure.bridge.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/13 14:29
 */
public abstract class DataBase {
    protected ExportFile impl;

    public void setImpl(ExportFile impl) {
        this.impl = impl;
    }

    public abstract String readData();

    public abstract void transformData();
}
