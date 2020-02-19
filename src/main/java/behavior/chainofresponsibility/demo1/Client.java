package behavior.chainofresponsibility.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/19 11:36
 */
public class Client {

    public static void main(String[] args) {
        Administrators zr,jl,zjl;
        zr = new Director("王启年");
        jl = new Manager("范闲");
        zjl = new GeneralManager("庆帝");
        zr.setSuccessor(jl);
        jl.setSuccessor(zjl);
        LeaveRequest l1,l2,l3,l4;
        l1 = new LeaveRequest("太子",2,"生病了");
        zr.processRequest(l1);
        l2 = new LeaveRequest("二皇子",5,"出去玩玩");
        zr.processRequest(l2);
        l3 = new LeaveRequest("长公主",15,"在家歇歇");
        zr.processRequest(l3);
        l4 = new LeaveRequest("陈萍萍",33,"归隐");
        zr.processRequest(l4);
    }
}
