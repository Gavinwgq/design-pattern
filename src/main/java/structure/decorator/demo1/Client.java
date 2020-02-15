package structure.decorator.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/15 15:11
 */
public class Client {

    public static void main(String[] args) {
        Data d1,d2,d3;
        String text = "Gavin";
        String ct ;
        d1 = new SimpleData();
        ct = d1.encryData(text);
        System.out.println(ct);
        System.out.println("---------------");
        d2 = new MoveIndex(d1);
        ct = d2.encryData(text);
        System.out.println(ct);
        System.out.println("---------------");
        d3 = new ModStr(d2);
        ct = d3.encryData(text);
        System.out.println(ct);
        System.out.println("---------------");
    }
}
