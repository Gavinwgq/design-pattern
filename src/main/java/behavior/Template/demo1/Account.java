package behavior.Template.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/29 11:15
 */
public abstract class Account {
    //基本方法 具体方法
    public boolean validate(String account,String password){
        return "小鱼儿".equals(account) && "123456".equals(password);
    }

    //基本方法——抽象方法
    public abstract void calculateInterest();

    //基本方法——具体方法
    public void display(){
        System.out.println("显示利息！");
    }

    //模板方法
    public void handle(String account, String password){
        if (!validate(account,password)){
            System.out.println("账户或密码错误！");
            return;
        }
        calculateInterest();
        display();
    }
}
