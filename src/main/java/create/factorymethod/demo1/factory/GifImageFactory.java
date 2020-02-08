package create.factorymethod.demo1.factory;

import create.factorymethod.demo1.product.GifImage;
import create.factorymethod.demo1.product.Image;

public class GifImageFactory implements ImageFactory {
    @Override
    public Image createReadImage() {
        return new GifImage();
    }
}
