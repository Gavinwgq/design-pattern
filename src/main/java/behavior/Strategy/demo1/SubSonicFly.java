package behavior.Strategy.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/21 15:39
 */
public class SubSonicFly extends SonicFly {
    @Override
    public void sonicFly() {
        System.out.println("亚音速飞行");
    }
}
