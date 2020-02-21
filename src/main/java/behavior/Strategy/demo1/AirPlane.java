package behavior.Strategy.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/21 15:37
 */
public class AirPlane extends Plane {
    public AirPlane() {
        this.name = "客机";
        this.takeOff = new LongDistanceTakeOff();
        this.sonicFly = new SubSonicFly();
        System.out.println(this.name);
    }
}
