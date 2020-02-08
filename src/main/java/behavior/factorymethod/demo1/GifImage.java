package behavior.factorymethod.demo1;

public class GifImage implements Image {
    @Override
    public void readImage() {
        System.out.println("读取Gif格式的图片");
    }
}
