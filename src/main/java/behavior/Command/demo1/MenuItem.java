package behavior.Command.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/20 15:22
 */
public class MenuItem {
    private String name;
    private Command command;

    public MenuItem(String name) {
        this.name = name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public String getName() {
        return name;
    }

    //发送请求的方法
    public void onClick() {
        System.out.print("点击"+this.name+"键：");
        command.execute();
    }
}
