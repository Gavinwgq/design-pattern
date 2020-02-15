package structure.decorator.demo1;

/**
 * 加密
 * @author wangguoqiang
 * @date 2020/2/15 14:58
 */
public class Encryption implements Data {
    private Data data;

    public Encryption(Data data) {
        this.data = data;
    }

    @Override
    public String encryData(String text) {
        return data.encryData(text);
    }
}
