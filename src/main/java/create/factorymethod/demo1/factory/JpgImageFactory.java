package create.factorymethod.demo1.factory;

import create.factorymethod.demo1.product.Image;
import create.factorymethod.demo1.product.JpgImage;

public class JpgImageFactory implements ImageFactory {
    @Override
    public Image createReadImage() {
        return new JpgImage();
    }
}
