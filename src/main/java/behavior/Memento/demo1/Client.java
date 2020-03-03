package behavior.Memento.demo1;

/**
 * @author wangguoqiang
 * @date 2020/3/3 20:24
 */
public class Client {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Student student = new Student("张三","二年级一班",18);
        System.out.println("----原始信息-----");
        System.out.println(student);
        //备份
        manager.setMemento(student.memento());
        System.out.println("---信息变更-----");
        student.setClassName("高三一班");
        System.out.println(student);
        student.recovery(manager.getMemento());
        System.out.println("----还原备份---");
        System.out.println(student);
    }
}
