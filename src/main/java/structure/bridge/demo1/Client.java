package structure.bridge.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/13 14:41
 */
public class Client {
    public static void main(String[] args) {
        ExportFile impl;
        DataBase db;
        impl = new XmlFile();
        db = new MySQL();
        db.setImpl(impl);
        db.transformData();
        System.out.println("---------------------");

        db = new Oracle();
        db.setImpl(impl);
        db.transformData();
        System.out.println("---------------------");

        impl = new TxtFile();
        db.setImpl(impl);
        db.transformData();
        System.out.println("---------------------");

        impl = new PdfFile();
        db.setImpl(impl);
        db.transformData();
    }
}
