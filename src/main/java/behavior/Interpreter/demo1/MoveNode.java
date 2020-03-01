package behavior.Interpreter.demo1;

/**
 * @author wangguoqiang
 * @date 2020/3/1 16:35
 */
public class MoveNode extends AbstractPracticeNode {
    private static final String MOVE = "MOVE";
    private static final String TABLE = "TABLE";
    private static final String FROM = "FROM";
    private static final String TO = "TO";

    private String table;
    private String srcDb;
    private String desDb;
    @Override
    public void interpret(PracticeContext context) {
        if(MOVE.equalsIgnoreCase(context.currectToken())){
            context.skipToken(context.currectToken());
        }else{
            System.out.println("指令错误");
        }
        if(TABLE.equalsIgnoreCase(context.currectToken())){
            context.skipToken(context.currectToken());
        }else{
            System.out.println("指令错误");
        }
        table = context.currectToken();
        if(table!=null){
            context.skipToken(table);
        }else{
            System.out.println("指令错误,table不能为空");
        }
        if(FROM.equalsIgnoreCase(context.currectToken())){
            context.skipToken(context.currectToken());
        }else{
            System.out.println("指令错误");
        }
        srcDb = context.currectToken();
        if(srcDb!=null){
            context.skipToken(srcDb);
        }else{
            System.out.println("指令错误,srcDb不能为空");
        }
        if(TO.equalsIgnoreCase(context.currectToken())){
            context.skipToken(context.currectToken());
        }else{
            System.out.println("指令错误");
        }
        desDb = context.currectToken();
        if(desDb!=null){
            context.skipToken(desDb);
        }else{
            System.out.println("指令错误,desDb不能为空");
        }
    }

    @Override
    public void execute() {
        System.out.println("跨数据库表格移动伪操作：");
        System.out.println("校验可用性：table->" + table + ", srcDB->" + srcDb + ", desDB->" + desDb);
        System.out.println("执行操作：");
        System.out.println("将" + srcDb + "数据库中" + table + "表移动至" + desDb + "数据库");
        System.out.println("**移动操作已完成**");
        System.out.println();
    }
}
