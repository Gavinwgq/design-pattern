package structure.decorator.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/15 15:04
 */
public class MoveIndex extends Encryption {
    public MoveIndex(Data data) {
        super(data);
    }

    @Override
    public String encryData(String text) {
        String s =  moveIndex(text);
        return super.encryData(s);
    }

    public String moveIndex(String str){
        return str+"{moveIndex}";
    }
}
