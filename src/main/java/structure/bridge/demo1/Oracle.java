package structure.bridge.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/13 14:38
 */
public class Oracle extends DataBase {
    @Override
    public String readData() {
        return "data from Oracle";
    }

    @Override
    public void transformData() {
        impl.export(readData());
    }
}
