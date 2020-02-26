package behavior.Visitor.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/26 20:20
 */
public class Teacher implements Candidate {
    private String name;
    private int score;
    private int paperNum;

    public Teacher(String name, int score, int paperNum) {
        this.name = name;
        this.score = score;
        this.paperNum = paperNum;
    }

    @Override
    public void accept(Award award) {
         award.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPaperNum() {
        return paperNum;
    }

    public void setPaperNum(int paperNum) {
        this.paperNum = paperNum;
    }
}
