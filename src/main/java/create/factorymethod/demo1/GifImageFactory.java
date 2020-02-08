package create.factorymethod.demo1;

public class GifImageFactory implements ImageFactory {
    @Override
    public Image createReadImage() {
        return new GifImage();
    }
}
