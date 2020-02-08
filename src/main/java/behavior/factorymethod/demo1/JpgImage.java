package behavior.factorymethod.demo1;

public class JpgImage implements Image {
    @Override
    public void readImage() {
        System.out.println("读取jpg格式的图片");
    }
}
