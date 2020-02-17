package structure.flyweight.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/17 21:22
 */
public class Client {

    public static void main(String[] args) {
        MyFile v1,v2,i1,i2;
        MyFileFactory fileFactory = MyFileFactory.getInstance();
        v1 = fileFactory.getMyFile("v");
        v2 = fileFactory.getMyFile("v");
        System.out.println(v1 == v2);
        i1 = fileFactory.getMyFile("i");
        i2 = fileFactory.getMyFile("i");
        System.out.println(i1 == i2);

        v1.display(new Location(4,6),new Size(640,480));
        v2.display(new Location(6,8),new Size(1080,720));
        i1.display(new Location(5,5),new Size(320,240));
        i2.display(new Location(7,5),new Size(640,480));
    }
}
