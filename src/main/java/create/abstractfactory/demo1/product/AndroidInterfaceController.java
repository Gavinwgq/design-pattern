package create.abstractfactory.demo1.product;

/**
 * 安卓游戏控制具体产品
 */
public class AndroidInterfaceController implements InterfaceController {
    @Override
    public void gameInterface() {
        System.out.println("安卓系统游戏界面显示");
    }
}
