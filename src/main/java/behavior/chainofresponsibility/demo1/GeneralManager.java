package behavior.chainofresponsibility.demo1;

/**
 * 总经理
 * @author wangguoqiang
 * @date 2020/2/19 11:23
 */
public class GeneralManager extends Administrators {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void processRequest(LeaveRequest request) {
        if(request.getDays()<30){
            System.out.println("总经理"+this.name+"审批了员工"+request.getName()+"请假"
                    +request.getDays()+"天，请假理由"+request.getReason());
        }else{
            System.out.println("过分了，你不用再来了！");
        }
    }
}
