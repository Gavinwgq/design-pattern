package behavior.Command.demo1;

import java.util.List;

/**
 * @author wangguoqiang
 * @date 2020/2/20 15:35
 */
public class Client {
    public static void main(String[] args) {
        BoardScreen boardScreen = new BoardScreen();
        MenuItem add,edit,open;
        add = new MenuItem("新增");
        add.setCommand(new AddCommand(boardScreen));
        edit = new MenuItem("编辑");
        edit.setCommand(new EditCommand(boardScreen));
        open = new MenuItem("打开");
        open.setCommand(new OpenCommand(boardScreen));
        Menu menu = new Menu();
        menu.addMenuItem(add);
        menu.addMenuItem(edit);
        menu.addMenuItem(open);
        List<MenuItem> list = menu.getList();
        for (MenuItem menuItem : list) {
            menuItem.onClick();
            System.out.println("*******************");
        }
    }
}
