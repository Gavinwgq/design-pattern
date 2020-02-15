package structure.decorator.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/15 15:04
 */
public class ModStr extends Encryption {
    public ModStr(Data data) {
        super(data);
    }

    @Override
    public String encryData(String text) {
        String s = modStr(text);
        return super.encryData(s);
    }

    public String modStr(String str){
        return str+"{mod}";
    }
}
