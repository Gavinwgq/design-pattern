package structure.flyweight.demo1;

import java.util.Hashtable;

/**
 * @author wangguoqiang
 * @date 2020/2/17 21:16
 */
public class MyFileFactory {
    private static MyFileFactory myFileFactory = new MyFileFactory();
    private static Hashtable<String,MyFile> ht;
    private MyFileFactory() {
        ht = new Hashtable<>();
        MyFile video,image;
        video = new Video();
        ht.put("v",video);
        image = new Image();
        ht.put("i",image);
    }

    public static MyFileFactory getInstance(){
        return myFileFactory;
    }

    public MyFile getMyFile(String type){
        return ht.get(type);
    }
}
