package structure.bridge.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/13 14:38
 */
public class XmlFile implements ExportFile {
    @Override
    public void export(String data) {
        System.out.println(data+" 转换为xml格式导出");
    }
}
