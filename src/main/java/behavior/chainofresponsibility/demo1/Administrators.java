package behavior.chainofresponsibility.demo1;

/**
 * 管理者
 * @author wangguoqiang
 * @date 2020/2/19 11:23
 */
public abstract class Administrators {
    protected Administrators successor;
    protected String name;

    public Administrators(String name) {
        this.name = name;
    }

    /**
     * 设置后继处理人员
     * @param successor
     */
    public void setSuccessor(Administrators successor){
        this.successor = successor;
    }

    /**
     * 抽象请求处理方法
     * @param request
     */
    public abstract void processRequest(LeaveRequest request);

}
