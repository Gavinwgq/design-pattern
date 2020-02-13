package structure.bridge.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/13 14:41
 */
public class PdfFile implements ExportFile {
    @Override
    public void export(String data) {
        System.out.println(data+" 转换为pdf文件导出");
    }
}
