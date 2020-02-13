package structure.bridge.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/13 14:39
 */
public class TxtFile implements ExportFile {
    @Override
    public void export(String data) {
        System.out.println(data+" 转换为txt文件导出");
    }
}
