package behavior.State.demo1;

/**
 * 游戏玩家  环境类
 * @author wangguoqiang
 * @date 2020/2/25 18:28
 */
public class GameUser {
    private GameUserLevel gameUserLevel;
    private String name;
    private int integral = 0;//初始积分

    public GameUser(String name) {
        this.name = name;
        this.gameUserLevel = new Primary(this);
        System.out.println("游戏玩家"+this.name+"出场，初始积分："+this.integral);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public GameUserLevel getGameUserLevel() {
        return gameUserLevel;
    }

    public void setGameUserLevel(GameUserLevel gameUserLevel) {
        this.gameUserLevel = gameUserLevel;
    }

    public void play(int score,int result){
        gameUserLevel.play(score, result);
    }

    public void changeCards(){
        gameUserLevel.changeCards();
    }

    public void peekCards(){
        gameUserLevel.peekCards();
    }
}
