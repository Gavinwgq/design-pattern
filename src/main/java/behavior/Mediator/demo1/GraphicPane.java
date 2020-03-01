package behavior.Mediator.demo1;

/**
 * @author wangguoqiang
 * @date 2020/3/1 11:03
 */
public class GraphicPane extends Pane {

    public void display(String name){
        System.out.println(String.format("展示[%s]的照片",name));
    }
}
