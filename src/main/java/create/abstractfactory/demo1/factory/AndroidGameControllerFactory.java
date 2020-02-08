package create.abstractfactory.demo1.factory;

import create.abstractfactory.demo1.product.AndroidInterfaceController;
import create.abstractfactory.demo1.product.AndroidOperationController;
import create.abstractfactory.demo1.product.InterfaceController;
import create.abstractfactory.demo1.product.OperationController;

/**
 * 安卓游戏控制工厂
 */
public class AndroidGameControllerFactory implements GameControllerFactory {
    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new AndroidInterfaceController();
    }
}
