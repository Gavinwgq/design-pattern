package create.abstractfactory.demo1.product;

/**
 * 安卓游戏控制具体产品
 */
public class AndroidOperationController implements OperationController {
    @Override
    public void gameOperation() {
        System.out.println("安卓系统游戏操作控制");
    }
}
