package create.singleton.demo1;

/**
 * 懒汉式单例
 * @author wangguoqiang
 * @date 2020/2/8
 */
public class LazySingleton {
    private volatile static LazySingleton  instance;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if(instance == null){
            synchronized (LazySingleton.class){
                //双重检查
                if(instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton l1,l2,l3;
        l1 = LazySingleton.getInstance();
        l2 = LazySingleton.getInstance();
        l3 = LazySingleton.getInstance();
        System.out.println(l1 == l2);
        System.out.println(l1 == l3);
    }
}
