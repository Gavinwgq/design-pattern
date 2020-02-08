package create.abstractfactory.demo1;

import create.abstractfactory.demo1.factory.AndroidGameControllerFactory;
import create.abstractfactory.demo1.factory.GameControllerFactory;
import create.abstractfactory.demo1.factory.SymbianGameControllerFactory;
import create.abstractfactory.demo1.factory.WpGameControllerFactory;
import create.abstractfactory.demo1.product.InterfaceController;
import create.abstractfactory.demo1.product.OperationController;

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
