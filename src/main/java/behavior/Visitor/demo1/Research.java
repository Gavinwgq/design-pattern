package behavior.Visitor.demo1;

/**
 * 科研奖
 * @author wangguoqiang
 * @date 2020/2/26 20:26
 */
public class Research extends Award {
    @Override
    public void visit(Student student) {
        if(student.getPaperNum()>2){
            System.out.println("恭喜"+student.getName()+"同学获得科研奖");
        }
    }

    @Override
    public void visit(Teacher teacher) {
        if(teacher.getPaperNum()>10){
            System.out.println("恭喜"+teacher.getName()+"教授获得科研奖");
        }
    }
}
