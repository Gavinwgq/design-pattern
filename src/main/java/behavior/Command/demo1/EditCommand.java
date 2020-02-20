package behavior.Command.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/20 15:33
 */
public class EditCommand extends Command {
    private BoardScreen boardScreen;

    public EditCommand(BoardScreen boardScreen) {
        this.boardScreen = boardScreen;
    }

    @Override
    public void execute() {
        boardScreen.edit();
    }
}
