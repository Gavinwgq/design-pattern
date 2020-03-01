package behavior.Interpreter.demo1;

/**
 * @author wangguoqiang
 * @date 2020/3/1 16:52
 */
public class Client {
    public static void main(String[] args) {
        PracticeContext context1,context2,context3;
        AbstractPracticeNode node1,node2,node3;

        System.out.println("****测试单条COPY指令****");
        context1 = new PracticeContext("COPY VIEW FROM srcDB TO desDB");
        node1 = new ExpressionNode();
        node1.interpret(context1);
        node1.execute();
        System.out.println("---------------------");

        System.out.println("****测试单条MOVE指令****");
        node2 = new ExpressionNode();
        context2 = new PracticeContext("MOVE TABLE Student FROM srcDB TO desDB");
        node2.interpret(context2);
        node2.execute();
        System.out.println("---------------------");

        System.out.println("****测试多条指令批量执行****");
        node3 = new ExpressionNode();
        context3 = new PracticeContext("COPY VIEW FROM srcDB1 TO desDB1 MOVE TABLE Student FROM srcDB1 TO desDB1");
        node3.interpret(context3);
        node3.execute();
    }
}
