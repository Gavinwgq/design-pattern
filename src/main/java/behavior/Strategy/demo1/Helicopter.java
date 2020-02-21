package behavior.Strategy.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/21 15:37
 */
public class Helicopter extends Plane {
    public Helicopter() {
        this.name = "直升机";
        this.takeOff = new VerticalTakeOff();
        this.sonicFly = new SubSonicFly();
        System.out.println(this.name);
    }
}
