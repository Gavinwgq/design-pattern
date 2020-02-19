package structure.proxy.demo1;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

/**
 * @author wangguoqiang
 * @date 2020/2/19 10:02
 */
public class ProxyUserService implements UserService{
    private UserServiceImpl userService = new UserServiceImpl();
    @Override
    public void addUser(int a) {
        preRequest("addUser()");
        try {
            userService.addUser(a);
            postRequest("addUser()",true);
        } catch (Exception e) {
            postRequest("addUser()",false);
        }
    }

    @Override
    public void updateUser(int a) {
        preRequest("updateUser()");
        try {
            userService.updateUser(a);
            postRequest("updateUser()",true);
        } catch (Exception e) {
            postRequest("updateUser()",false);
        }
    }

    public void preRequest(String methodName){
        System.out.println("方法"+methodName+"被调用,时间"+ DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss"));
    }

    public void postRequest(String methodName,boolean isSuccess){
        if(isSuccess){
            System.out.println("方法"+methodName+"调用成功");
        }else{
            System.out.println("方法"+methodName+"调用失败");
        }
    }
}
