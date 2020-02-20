package behavior.Command.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/20 15:33
 */
public class OpenCommand extends Command {
    private BoardScreen boardScreen;

    public OpenCommand(BoardScreen boardScreen) {
        this.boardScreen = boardScreen;
    }

    @Override
    public void execute() {
        boardScreen.open();
    }
}
