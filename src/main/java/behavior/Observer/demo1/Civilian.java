package behavior.Observer.demo1;

/**
 * 平民散户
 * @author wangguoqiang
 * @date 2020/2/29 16:30
 */
public class Civilian implements Shareholder {
    private String name;

    public Civilian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void handleShare() {
        System.out.println("散户"+this.name+"非常高兴,增持了100手");
    }
}
