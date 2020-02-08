package create.factorymethod.demo1;

import create.factorymethod.demo1.factory.GifImageFactory;
import create.factorymethod.demo1.factory.ImageFactory;
import create.factorymethod.demo1.factory.JpgImageFactory;
import create.factorymethod.demo1.product.Image;

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
