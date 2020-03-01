package behavior.Interpreter.demo1;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author wangguoqiang
 * @date 2020/3/1 16:40
 */
public class ExpressionNode extends AbstractPracticeNode {
    private AbstractPracticeNode practiceNode;
    private static final String COPY = "COPY";
    private static final String MOVE = "MOVE";
    private List<AbstractPracticeNode> list = Lists.newArrayList();
    @Override
    public void interpret(PracticeContext context) {
        while (context.currectToken() != null) {
            if (COPY.equalsIgnoreCase(context.currectToken())) {
                practiceNode = new CopyNode();
            } else if (MOVE.equalsIgnoreCase(context.currectToken())) {
                practiceNode = new MoveNode();
            } else {
                System.out.println(String.format("指令无法解析：%s", context));
            }
            list.add(practiceNode);
            practiceNode.interpret(context);
        }
    }

    @Override
    public void execute() {
        for (AbstractPracticeNode node : list) {
            node.execute();
        }
    }
}
