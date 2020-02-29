package behavior.Observer.demo1;

/**
 * 资本大佬
 * @author wangguoqiang
 * @date 2020/2/29 16:30
 */
public class RichMan implements Shareholder {
    private String name;

    public RichMan(String name) {
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
        System.out.println("资本大佬"+this.name+"表示非常淡定,增持了100000手");
    }
}
