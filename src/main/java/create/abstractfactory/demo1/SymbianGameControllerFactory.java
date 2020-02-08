package create.abstractfactory.demo1;

public class SymbianGameControllerFactory implements GameControllerFactory{
    @Override
    public OperationController createOperationController() {
        return new SymbianOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new SymbianInterfaceController();
    }
}
