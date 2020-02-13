package structure.bridge.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/13 14:34
 */
public class MySQL extends DataBase {
    @Override
    public String readData() {
        return "data from MySQL";
    }

    @Override
    public void transformData() {
        impl.export(readData());
    }
}
