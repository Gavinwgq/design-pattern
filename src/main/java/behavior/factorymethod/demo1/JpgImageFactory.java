package behavior.factorymethod.demo1;

public class JpgImageFactory implements ImageFactory {
    @Override
    public Image createReadImage() {
        return new JpgImage();
    }
}
