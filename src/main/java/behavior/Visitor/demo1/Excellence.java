package behavior.Visitor.demo1;

/**
 * 优秀奖
 * @author wangguoqiang
 * @date 2020/2/26 20:26
 */
public class Excellence extends Award {
    @Override
    public void visit(Student student) {
        if(student.getScore()>90){
            System.out.println("恭喜"+student.getName()+"同学获得成绩优秀奖");
        }
    }

    @Override
    public void visit(Teacher teacher) {
        if(teacher.getScore()>90){
            System.out.println("恭喜"+teacher.getName()+"教授获得成绩优秀奖");
        }
    }
}
