package structure.flyweight.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/17 16:51
 */
public abstract class MyFile {
    public abstract String getUrl();

    public void display(Location location,Size size){
        System.out.println("文件地址"+this.getUrl()+
                "显示位置("+location.getX()+","+location.getY()+"),显示分辨率为("
                +size.getWidth()+"*"+size.getHeight()+")");
    }
}
