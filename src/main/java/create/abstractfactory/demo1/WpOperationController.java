package create.abstractfactory.demo1;

public class WpOperationController implements OperationController {
    @Override
    public void gameOperation() {
        System.out.println("Wp系统游戏操作控制");
    }
}
