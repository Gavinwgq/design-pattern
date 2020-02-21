package behavior.Strategy.demo1;

/**
 * 飞机抽象类
 * @author wangguoqiang
 * @date 2020/2/21 15:04
 */
public abstract class Plane {
    protected String name;
    protected TakeOff takeOff;
    protected SonicFly sonicFly;

    public void takeOff(){
        takeOff.takeOff();
    }
    public void sonicFly(){
        sonicFly.sonicFly();
    }

}
