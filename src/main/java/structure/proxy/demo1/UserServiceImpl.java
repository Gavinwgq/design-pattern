package structure.proxy.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/19 9:58
 */
public class UserServiceImpl implements UserService{
    @Override
    public void addUser(int a) {
        if(a%2==0){
            System.out.println("增加一个用户");
        }else {
            throw new RuntimeException("增加用户出现异常");
        }

    }

    @Override
    public void updateUser(int a) {
        if(a%2==0){
            System.out.println("更新一个用户");
        }else {
            throw new RuntimeException("更新用户出现异常");
        }
    }
}
