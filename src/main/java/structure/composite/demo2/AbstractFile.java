package structure.composite.demo2;

/**
 * @author wangguoqiang
 * @date 2020/2/14 18:02
 */
public abstract class AbstractFile {
    public abstract void add(AbstractFile abstractFile);
    public abstract void remove(AbstractFile abstractFile);
    public abstract AbstractFile getChild(int i);
    public abstract void killVirus();
}
