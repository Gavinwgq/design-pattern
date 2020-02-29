package behavior.Template.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/29 11:22
 */
public class SavingAccount extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("按定期利率计算利息！");
    }
}
