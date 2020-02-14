package structure.composite.demo2;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author wangguoqiang
 * @date 2020/2/14 18:07
 */
public class Folder extends AbstractFile {
    private List<AbstractFile> fileList = Lists.newArrayList();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile abstractFile) {
        fileList.add(abstractFile);
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        fileList.remove(abstractFile);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("对文件夹"+name+"进行杀毒");
        for (AbstractFile file : fileList) {
            file.killVirus();
        }
    }
}
