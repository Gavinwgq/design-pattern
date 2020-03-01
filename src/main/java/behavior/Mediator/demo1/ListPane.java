package behavior.Mediator.demo1;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author wangguoqiang
 * @date 2020/3/1 11:03
 */
public class ListPane extends Pane {
    private List<String> nameList = Lists.newArrayList();

    public String name;

    public String getName() {
        return this.name;
    }

    public void addNameList(String name){
        nameList.add(name);
        System.out.println(String.format("姓名列表增加一人：[%s]",name));
        showList();
    }

    public void selectName(String name){
        System.out.println(String.format("选中列表一人：[%s]",name));
        this.name = name;
        change();
    }
    private void showList(){
        System.out.println(nameList);
    }
}
