package create.abstractfactory.demo1.factory;

import create.abstractfactory.demo1.product.InterfaceController;
import create.abstractfactory.demo1.product.OperationController;

/**
 * 抽象工厂
 */
public interface GameControllerFactory {
    OperationController createOperationController();
    InterfaceController createInterfaceController();
}
