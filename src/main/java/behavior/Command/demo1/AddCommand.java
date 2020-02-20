package behavior.Command.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/20 15:33
 */
public class AddCommand extends Command {
    private BoardScreen boardScreen;

    public AddCommand(BoardScreen boardScreen) {
        this.boardScreen = boardScreen;
    }

    @Override
    public void execute() {
        boardScreen.add();
    }
}
