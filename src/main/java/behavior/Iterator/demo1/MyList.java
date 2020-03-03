package behavior.Iterator.demo1;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author wangguoqiang
 * @date 2020/3/3 18:28
 */
public class MyList<T> {
    private List<T> list = Lists.newArrayList();

    public void add(T t){
        this.list.add(t);
    }

    public void remove(T t){
        this.list.remove(t);
    }

    public MyIterator getIterator(){
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements MyIterator{

        /**
         * 定义游标,用于记录遍历时的位置
         */
        private int cursor = 0;

        @Override
        public void next() {
            if(cursor<list.size()){
                cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            return cursor<list.size();
        }

        @Override
        public boolean isFirst() {
            return cursor == 0;
        }

        @Override
        public boolean isLast() {
            return cursor == list.size()-1;
        }

        @Override
        public Object getCurrentObject() {
            return list.get(cursor);
        }
    }
}
