package behavior.Visitor.demo1;

/**
 * 候选人
 * @author wangguoqiang
 * @date 2020/2/26 20:16
 */
public interface Candidate {
    void accept(Award award);
}
