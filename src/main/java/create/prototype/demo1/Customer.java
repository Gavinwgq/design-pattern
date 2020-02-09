package create.prototype.demo1;

import java.io.*;

/**
 * @author wangguoqiang
 * @date 2020/2/9 16:46
 */
public class Customer implements Cloneable,Serializable {
    private String name;
    private int age;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //使用clone方法实现浅克隆
    public Customer clone(){
        Object obj = null;
        try {
            obj = super.clone();
            return (Customer) obj;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制");
            return null;
        }
    }


    //使用序列化的方式实现深克隆
    public Customer deepClone() throws IOException, ClassNotFoundException {
        //将对象写入流中
        ByteArrayOutputStream bao=new  ByteArrayOutputStream();
        ObjectOutputStream oos=new  ObjectOutputStream(bao);
        oos.writeObject(this);

        //将对象从流中取出
        ByteArrayInputStream bis=new  ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois=new  ObjectInputStream(bis);
        return  (Customer) ois.readObject();
    }
}
