package create.factorymethod.demo1.product;

public class GifImage implements Image {
    @Override
    public void readImage() {
        System.out.println("读取Gif格式的图片");
    }
}
