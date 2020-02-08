package create.singleton.demo1;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() { }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        EagerSingleton e1,e2,e3;
        e1 = EagerSingleton.getInstance();
        e2 = EagerSingleton.getInstance();
        e3 = EagerSingleton.getInstance();
        System.out.println(e1==e2);
        System.out.println(e1==e3);
    }
}
