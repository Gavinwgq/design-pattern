package structure.adapter.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/12 16:47
 */
public class Adapter implements Target {
    private ThirdEncry thirdEncry;

    public Adapter(ThirdEncry thirdEncry) {
        this.thirdEncry = thirdEncry;
    }

    @Override
    public void request(String text) {
        thirdEncry.encryText(text);
    }
}
