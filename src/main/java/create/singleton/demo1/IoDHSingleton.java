package create.singleton.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/8
 */
public class IoDHSingleton {
    private IoDHSingleton(){}
    private static class HolderClass{
        private final static IoDHSingleton instance = new IoDHSingleton();
    }
    public static IoDHSingleton getInstance(){
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        IoDHSingleton i1,i2,i3;
        i1 = IoDHSingleton.getInstance();
        i2 = IoDHSingleton.getInstance();
        i3 = IoDHSingleton.getInstance();
        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
    }
}
