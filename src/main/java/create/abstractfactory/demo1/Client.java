package create.abstractfactory.demo1;

public class Client {
    public static void main(String[] args) {
        OperationController oc;
        InterfaceController ic;
        GameControllerFactory factory;
        factory = new SymbianGameControllerFactory();
        oc = factory.createOperationController();
        oc.gameOperation();
        ic = factory.createInterfaceController();
        ic.gameInterface();
        System.out.println("-------------");
        factory = new AndroidGameControllerFactory();
        oc = factory.createOperationController();
        oc.gameOperation();
        ic = factory.createInterfaceController();
        ic.gameInterface();
        System.out.println("--------------");
        factory = new WpGameControllerFactory();
        oc = factory.createOperationController();
        oc.gameOperation();
        ic = factory.createInterfaceController();
        ic.gameInterface();

    }
}
