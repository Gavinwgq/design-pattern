package behavior.Memento.demo1;

/**
 * @author wangguoqiang
 * @date 2020/3/3 20:19
 */
public class Memento {
    private String sname;
    private String sclassName;
    private int sage;

    public Memento(Student student){
        this.sname = student.getName();
        this.sclassName = student.getClassName();
        this.sage = student.getAge();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSclassName() {
        return sclassName;
    }

    public void setSclassName(String sclassName) {
        this.sclassName = sclassName;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }
}
