package behavior.Template.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/29 11:23
 */
public class Client {

    public static void main(String[] args) {
        Account a1,a2;
        a1 = new CurrentAccount();
        a1.handle("张三","123456");
        a1.handle("小鱼儿","123456");
        System.out.println("------------------");
        a2 = new SavingAccount();
        a2.handle("张三","123456");
        a2.handle("小鱼儿","123456");
    }
}
