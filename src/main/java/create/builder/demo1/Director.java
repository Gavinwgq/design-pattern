package create.builder.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/10 21:12
 */
public class Director {
    private PlayerBuilder playerBuilder;

    public Director(PlayerBuilder playerBuilder) {
        this.playerBuilder = playerBuilder;
    }

    public Player construct(){
        if(playerBuilder.isShowMenu()){
            playerBuilder.buildMenu();
        }
        if(playerBuilder.isShowPlayList()){
            playerBuilder.buildPlayList();
        }
        if(playerBuilder.isShowMainWindow()){
            playerBuilder.buildMainWindow();
        }
        if(playerBuilder.isShowCtrl()){
            playerBuilder.buildCtrl();
        }
        return playerBuilder.getPlayer();
    }
}
