package behavior.Visitor.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/26 20:33
 */
public class Client {
    public static void main(String[] args) {
        Candidate c1,c2,c3,c4,c5,c6;
        c1 = new Student("范闲",95,3);
        c2 = new Student("范思哲",85,4);
        c3 = new Student("范若若",92,1);
        c4 = new Teacher("范健",93,9);
        c5 = new Teacher("庆帝",88,12);
        c6 = new Teacher("陈萍萍",95,13);

        CandidateList candidateList = new CandidateList();
        candidateList.addCandidate(c1);
        candidateList.addCandidate(c2);
        candidateList.addCandidate(c3);
        candidateList.addCandidate(c4);
        candidateList.addCandidate(c5);
        candidateList.addCandidate(c6);

        System.out.println("-----评选科研奖------");
        candidateList.accept(new Research());

        System.out.println("-----评选成绩优秀奖------");
        candidateList.accept(new Excellence());
    }
}
