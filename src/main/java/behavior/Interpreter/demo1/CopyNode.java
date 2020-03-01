package behavior.Interpreter.demo1;

/**
 * @author wangguoqiang
 * @date 2020/3/1 16:26
 */
public class CopyNode extends AbstractPracticeNode {
    private static final String COPY = "COPY";
    private static final String VIEW = "VIEW";
    private static final String FROM = "FROM";
    private static final String TO = "TO";

    private String srcDb;
    private String desDb;
    @Override
    public void interpret(PracticeContext practiceContext) {
        if(COPY.equalsIgnoreCase(practiceContext.currectToken())){
            practiceContext.skipToken(practiceContext.currectToken());
        }else{
            System.out.println("指令错误");
        }
        if(VIEW.equalsIgnoreCase(practiceContext.currectToken())){
            practiceContext.skipToken(practiceContext.currectToken());
        }else{
            System.out.println("指令错误");
        }
        if(FROM.equalsIgnoreCase(practiceContext.currectToken())){
            practiceContext.skipToken(practiceContext.currectToken());
        }else{
            System.out.println("指令错误");
        }
        srcDb = practiceContext.currectToken();
        if(srcDb != null){
            practiceContext.skipToken(srcDb);
        }else{
            System.out.println("指令错误,srcDb 不能为空");
        }
        if(TO.equalsIgnoreCase(practiceContext.currectToken())){
            practiceContext.skipToken(practiceContext.currectToken());
        }else{
            System.out.println("指令错误");
        }
        desDb = practiceContext.currectToken();
        if(desDb != null){
            practiceContext.skipToken(desDb);
        }else{
            System.out.println("指令错误,desDb 不能为空");
        }
    }

    @Override
    public void execute() {
        System.out.println("跨数据库视图复制操作：");
        System.out.println("校验可用性：srcDB->" + srcDb + ", desDB->" + desDb);
        System.out.println("执行操作：");
        System.out.println("将" + srcDb + "数据库中所有视图复制到" + desDb + "数据库");
        System.out.println("**复制操作已完成**");
        System.out.println();
    }
}
