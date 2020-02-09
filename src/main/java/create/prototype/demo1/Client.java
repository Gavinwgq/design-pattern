package create.prototype.demo1;

import java.io.IOException;

/**
 * @author wangguoqiang
 * @date 2020/2/9 16:53
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Customer c1 = new Customer();
        c1.setName("小鱼儿");
        c1.setAge(18);
        Address a1 = new Address();
        a1.setProvince("河南省");
        a1.setCity("郑州市");
        a1.setCounty("高新区");
        c1.setAddress(a1);
        Customer c2 = c1.clone();
        System.out.println(c1 == c2);
        System.out.println(c1.getAge() == c2.getAge());
        System.out.println(c1.getName() == c2.getName());
        System.out.println(c1.getAddress() == c2.getAddress());
        System.out.println("-----------------");
        Customer c3 = c1.deepClone();
        System.out.println(c1 == c3);
        System.out.println(c1.getAge() == c3.getAge());
        System.out.println(c1.getName() == c3.getName());
        System.out.println(c1.getAddress() == c3.getAddress());
    }
}
