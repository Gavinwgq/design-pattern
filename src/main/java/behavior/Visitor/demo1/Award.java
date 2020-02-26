package behavior.Visitor.demo1;

/**
 * 奖项
 * @author wangguoqiang
 * @date 2020/2/26 20:19
 */
public abstract class Award {
    public abstract void visit(Student student);
    public abstract void visit(Teacher teacher);
}
