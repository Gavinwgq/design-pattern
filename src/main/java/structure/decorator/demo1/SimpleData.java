package structure.decorator.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/15 15:30
 */
public class SimpleData implements Data {
    @Override
    public String encryData(String text) {
       return text+"{simple}" ;
    }
}
