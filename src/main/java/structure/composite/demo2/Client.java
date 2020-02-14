package structure.composite.demo2;

/**
 * @author wangguoqiang
 * @date 2020/2/14 18:10
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile file1,file2,file3,file4,file5,folder1,folder2,folder3,folder4;
        folder1 = new Folder("Gavin的资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");
        folder4 = new Folder("视频文件");
        file1 = new ImageFile("小鱼儿.jpg");
        file2 = new ImageFile("花无缺.gif");
        file3 = new TextFile("嫁衣神功.txt");
        file4 = new TextFile("移花接玉.doc");
        file5 = new VideoFile("无敌神功.rmvb");
        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder4.add(file5);
        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);
        folder1.killVirus();
    }
}
