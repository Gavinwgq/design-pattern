package behavior.Strategy.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/21 15:58
 */
public class Client {
    public static void main(String[] args) {
        Plane p1,p2,p3,p4;
        p1 = new Helicopter();
        p1.takeOff();
        p1.sonicFly();
        System.out.println("-------------------");
        p2 = new AirPlane();
        p2.takeOff();
        p2.sonicFly();
        System.out.println("-------------------");
        p3 = new Fighter();
        p3.takeOff();
        p3.sonicFly();
        System.out.println("-------------------");
        p4 = new Harrier();
        p4.takeOff();
        p4.sonicFly();
    }
}
