package create.builder.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/10 21:26
 */
public class Client {
    public static void main(String[] args) {
        Director d1 = new Director(new FullPlayerBuilder());
        System.out.println("完整模式");
        d1.construct();
        System.out.println("-----------------");
        Director d2 = new Director(new SimplePlayerBuilder());
        System.out.println("精简模式");
        d2.construct();
        System.out.println("-----------------");
        Director d3 = new Director(new MemoryPlayerBuilder());
        System.out.println("记忆模式");
        d3.construct();
    }
}
