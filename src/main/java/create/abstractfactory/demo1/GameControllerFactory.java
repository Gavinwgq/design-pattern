package create.abstractfactory.demo1;

public interface GameControllerFactory {
    OperationController createOperationController();
    InterfaceController createInterfaceController();
}
