package create.abstractfactory.demo1.product;

/**
 * wp游戏控制具体产品
 */
public class WpOperationController implements OperationController {
    @Override
    public void gameOperation() {
        System.out.println("Wp系统游戏操作控制");
    }
}
