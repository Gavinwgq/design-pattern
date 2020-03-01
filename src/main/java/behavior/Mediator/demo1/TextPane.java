package behavior.Mediator.demo1;

import com.sun.javafx.binding.StringFormatter;

import java.text.Format;

/**
 * @author wangguoqiang
 * @date 2020/3/1 11:01
 */
public class TextPane extends Pane {

    private String name;

    public String getName() {
        return this.name;
    }

    public void addText(String name){
        System.out.println(String.format("文本域增加一条文本[%s]",name));
        this.name = name;
        change();
    }

}
