package structure.proxy.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/19 10:11
 */
public class Clent {
    public static void main(String[] args) {
        ProxyUserService proxy = new ProxyUserService();
        int a = 1;
        proxy.addUser(a);
        System.out.println("------------------");
        proxy.updateUser(a);
        System.out.println("------------------");
        a = 2;
        proxy.addUser(a);
        System.out.println("------------------");
        proxy.updateUser(a);
    }
}
