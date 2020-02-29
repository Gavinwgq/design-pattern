package behavior.Template.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/29 11:21
 */
public class CurrentAccount extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("按活期利率计算利息！");
    }
}
