package create.abstractfactory.demo1.product;

/**
 * wp游戏控制具体产品
 */
public class WpInterfaceController implements InterfaceController {
    @Override
    public void gameInterface() {
        System.out.println("Wp系统游戏界面显示");
    }
}
