package behavior.Command.demo1;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author wangguoqiang
 * @date 2020/2/20 15:21
 */
public class Menu {
    private List<MenuItem> list = Lists.newArrayList();

    public List<MenuItem> getList() {
        return list;
    }

    public void addMenuItem(MenuItem menuItem){
        list.add(menuItem);
    }
}
