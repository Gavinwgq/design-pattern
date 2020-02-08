package create.abstractfactory.demo1.product;

/**
 * 塞班游戏控制具体产品
 */
public class SymbianOperationController implements OperationController {
    @Override
    public void gameOperation() {
        System.out.println("塞班系统游戏操作控制");
    }
}
