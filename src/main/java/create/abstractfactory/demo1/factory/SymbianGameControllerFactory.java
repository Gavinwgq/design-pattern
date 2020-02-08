package create.abstractfactory.demo1.factory;

import create.abstractfactory.demo1.product.InterfaceController;
import create.abstractfactory.demo1.product.OperationController;
import create.abstractfactory.demo1.product.SymbianInterfaceController;
import create.abstractfactory.demo1.product.SymbianOperationController;

/**
 * 塞班游戏控制工厂
 */
public class SymbianGameControllerFactory implements GameControllerFactory {
    @Override
    public OperationController createOperationController() {
        return new SymbianOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new SymbianInterfaceController();
    }
}
