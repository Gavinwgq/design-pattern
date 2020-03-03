package behavior.Iterator.demo1;

/**
 * @author wangguoqiang
 * @date 2020/3/3 18:34
 */
public class Client {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("aa");
        myList.add("bb");
        myList.add("cc");
        MyIterator myIterator = myList.getIterator();
        while (myIterator.hasNext()){
            System.out.println(myIterator.getCurrentObject());
            myIterator.next();
        }
    }
}
