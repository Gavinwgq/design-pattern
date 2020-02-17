package structure.flyweight.demo1;

/**
 * 显示分辨率
 * @author wangguoqiang
 * @date 2020/2/17 20:46
 */
public class Size {
    private int height;
    private int width;

    public Size(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
