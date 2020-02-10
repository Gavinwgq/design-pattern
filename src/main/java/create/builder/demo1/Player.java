package create.builder.demo1;

import java.util.List;

/**
 * @author wangguoqiang
 * @date 2020/2/10 14:50
 */
public class Player {

    private String menu;
    private List<String> playList;
    private String mianWindow;
    private String ctrl;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public List<String> getPlayList() {
        return playList;
    }

    public void setPlayList(List<String> playList) {
        this.playList = playList;
    }

    public String getMianWindow() {
        return mianWindow;
    }

    public void setMianWindow(String mianWindow) {
        this.mianWindow = mianWindow;
    }

    public String getCtrl() {
        return ctrl;
    }

    public void setCtrl(String ctrl) {
        this.ctrl = ctrl;
    }
}
