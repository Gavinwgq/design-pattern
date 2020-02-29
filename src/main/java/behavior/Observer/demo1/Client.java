package behavior.Observer.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/29 16:34
 */
public class Client {
    public static void main(String[] args) {
        Shares shares = new Shares("阿里巴巴");
        Shareholder s1,s2,s3;
        s1 = new Civilian("范闲");
        s2 = new Civilian("范思哲");
        s3 = new RichMan("庆帝");

        shares.addShareholer(s1);
        shares.addShareholer(s2);
        shares.addShareholer(s3);

        shares.setRange(0.08);
        shares.notifyRange();
        System.out.println("---------------------");
        shares.setRange(0.04);
        shares.notifyRange();
        System.out.println("---------------------");

        shares.removeShareholer(s2);

        shares.setRange(0.06);
        shares.notifyRange();
        System.out.println("---------------------");
    }
}
