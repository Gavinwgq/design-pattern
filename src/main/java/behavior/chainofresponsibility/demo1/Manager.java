package behavior.chainofresponsibility.demo1;

/**
 * 经理
 * @author wangguoqiang
 * @date 2020/2/19 11:23
 */
public class Manager extends Administrators {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void processRequest(LeaveRequest request) {
        if(request.getDays()<10){
            System.out.println("经理"+this.name+"审批了员工"+request.getName()+"请假"
                    +request.getDays()+"天，请假理由"+request.getReason());
        }else{
            successor.processRequest(request);
        }
    }
}
