package structure.facade.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/16 18:24
 */
public class Client {
    public static void main(String[] args) {
        DealOrderFacade facade = new DealOrderFacade();
        facade.createOrder();
        System.out.println("-----------------------");
        facade.payOrder();
    }
}
