package behavior.factorymethod.demo1;

public class Client {

    public static void main(String[] args) {
        Image image;
        ImageFactory imageFactory;
        imageFactory = new JpgImageFactory();
        image = imageFactory.createReadImage();
        image.readImage();
        System.out.println("------------------");
        imageFactory = new GifImageFactory();
        image = imageFactory.createReadImage();
        image.readImage();
    }
}
