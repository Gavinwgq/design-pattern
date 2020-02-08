package create.abstractfactory.demo1.factory;

import create.abstractfactory.demo1.product.InterfaceController;
import create.abstractfactory.demo1.product.OperationController;
import create.abstractfactory.demo1.product.WpInterfaceController;
import create.abstractfactory.demo1.product.WpOperationController;

/**
 * wp游戏控制工厂
 */
public class WpGameControllerFactory implements GameControllerFactory {
    @Override
    public OperationController createOperationController() {
        return new WpOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new WpInterfaceController();
    }
}
