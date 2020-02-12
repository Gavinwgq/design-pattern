package structure.adapter.demo1;

/**
 * 客户端
 * @author wangguoqiang
 * @date 2020/2/12 16:49
 */
public class Client {

    public static void main(String[] args) {
        ThirdEncry thirdEncry = new ThirdEncry();
        Target target = new Adapter(thirdEncry);
        target.request("用户机密信息");
    }
}
