package structure.facade.demo1;

/**
 * 商品系统
 * @author wangguoqiang
 * @date 2020/2/16 18:17
 */
public class Good {
    public void lockStore(){
        System.out.println("锁定库存");
    }

    public void updateStore(){
        System.out.println("更新库存");
    }
}
