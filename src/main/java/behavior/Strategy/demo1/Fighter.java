package behavior.Strategy.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/21 15:37
 */
public class Fighter extends Plane {
    public Fighter() {
        this.name = "歼击机";
        this.takeOff = new LongDistanceTakeOff();
        this.sonicFly = new SuperSonicFly();
        System.out.println(this.name);
    }
}
