package create.builder.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/10 21:23
 */
public class SimplePlayerBuilder extends PlayerBuilder {
    @Override
    public boolean isShowMenu() {
        return false;
    }

    @Override
    public boolean isShowPlayList() {
        return false;
    }
}
