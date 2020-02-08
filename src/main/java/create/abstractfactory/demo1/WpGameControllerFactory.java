package create.abstractfactory.demo1;

public class WpGameControllerFactory implements GameControllerFactory{
    @Override
    public OperationController createOperationController() {
        return new WpOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new WpInterfaceController();
    }
}
