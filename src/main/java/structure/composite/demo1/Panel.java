package structure.composite.demo1;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author wangguoqiang
 * @date 2020/2/14 17:09
 */
public class Panel extends Component {
    private List<Component> children = Lists.newArrayList();

    public void add(Component component){
        children.add(component);
    }

    public void remove(Component component){
        children.remove(component);
    }

    public Component getChild(int i){
        if(children.size()<=i){
            return null;
        }
        return children.get(i);
    }

    @Override
    public void draw() {
        System.out.println("绘制一个面板");
        for (Component child : children) {
            child.draw();
        }
    }
}
