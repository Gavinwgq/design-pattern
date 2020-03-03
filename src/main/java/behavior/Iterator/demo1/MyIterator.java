package behavior.Iterator.demo1;

/**
 * @author wangguoqiang
 * @date 2020/3/3 18:27
 */
public interface MyIterator {
    /**
     * 将游标指向下一个元素
     */
    public void next();

    /**
     * 判断是否存在下一个元素
     */
    public boolean hasNext();

    /**
     * 判断当前游标是否是第一个
     */
    public boolean isFirst();

    /**
     * 判断当前游标是否是最后一个
     */
    public boolean isLast();

    /**
     * 获取当前游标指向的对象
     */
    public Object getCurrentObject();
}
