package behavior.Strategy.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/21 15:38
 */
public class VerticalTakeOff extends TakeOff {
    @Override
    public void takeOff() {
        System.out.println("垂直起飞");
    }
}
