package create.abstractfactory.demo1.product;

/**
 * 塞班游戏控制具体产品
 */
public class SymbianInterfaceController implements InterfaceController {
    @Override
    public void gameInterface() {
        System.out.println("塞班系统游戏界面显示");
    }
}
