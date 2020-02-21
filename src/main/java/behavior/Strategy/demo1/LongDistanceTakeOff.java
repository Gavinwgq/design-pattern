package behavior.Strategy.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/21 15:39
 */
public class LongDistanceTakeOff extends TakeOff {
    @Override
    public void takeOff() {
        System.out.println("长距离起飞");
    }
}
