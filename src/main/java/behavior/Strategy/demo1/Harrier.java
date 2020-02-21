package behavior.Strategy.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/21 15:37
 */
public class Harrier extends Plane {
    public Harrier() {
        this.name = "鹞式战斗机";
        this.takeOff = new VerticalTakeOff();
        this.sonicFly = new SuperSonicFly();
        System.out.println(this.name);
    }
}
