package create.builder.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/10 21:05
 */
public  class PlayerBuilder {
    protected Player player = new Player();

    public  void buildMenu(){
        System.out.println("构建菜单");
    }
    public  void buildPlayList(){
        System.out.println("构建播放菜单");
    }
    public  void buildMainWindow(){
        System.out.println("构建主窗口");
    }
    public  void buildCtrl(){
        System.out.println("构建控制条");
    }

    public boolean isShowMenu(){
        return true;
    }
    public boolean isShowPlayList(){
        return true;
    }
    public boolean isShowMainWindow(){
        return true;
    }
    public boolean isShowCtrl(){
        return true;
    }

    public Player getPlayer(){
        return player;
    }
}
