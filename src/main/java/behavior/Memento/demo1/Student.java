package behavior.Memento.demo1;

/**
 * @author wangguoqiang
 * @date 2020/3/3 20:17
 */
public class Student {
    private String name;
    private String className;
    private int age;

    public Student(String name, String className, int age) {
        this.name = name;
        this.className = className;
        this.age = age;
    }

    public Memento memento(){
        return new Memento(this);
    }

    public void recovery(Memento memento){
        this.name = memento.getSname();
        this.className = memento.getSclassName();
        this.age = memento.getSage();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", age=" + age +
                '}';
    }
}
