package structure.facade.demo1;

/**
 * 订单外观
 * @author wangguoqiang
 * @date 2020/2/16 18:19
 */
public class DealOrderFacade {
    private Account account = new Account();
    private Order order  = new Order();
    private Good good = new Good();


    public void createOrder(){
        account.login();
        order.preOrder();
        good.lockStore();
    }

    public void payOrder(){
        account.updateAccount();
        order.issueOrder();
        good.updateStore();
    }
}
