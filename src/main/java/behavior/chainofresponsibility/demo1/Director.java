package behavior.chainofresponsibility.demo1;

/**
 * 主任
 * @author wangguoqiang
 * @date 2020/2/19 11:23
 */
public class Director extends Administrators {
    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(LeaveRequest request) {
        if(request.getDays()<3){
            System.out.println("主任"+this.name+"审批了员工"+request.getName()+"请假"
                    +request.getDays()+"天，请假理由"+request.getReason());
        }else{
            successor.processRequest(request);
        }
    }
}
