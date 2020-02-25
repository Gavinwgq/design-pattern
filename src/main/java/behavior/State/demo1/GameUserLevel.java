package behavior.State.demo1;

/**
 * 游戏玩家级别
 * @author wangguoqiang
 * @date 2020/2/25 18:31
 */
public abstract class GameUserLevel {
    protected String levalName;
    protected GameUser gameUser;
    protected boolean doubleScore;
    public abstract void checkLevel();
    public void play(int score,int result){
        if(result == 0){
            System.out.println("本局失败，扣分"+score);
            gameUser.setIntegral(gameUser.getIntegral() - score);
        }else{
            if(doubleScore){
                System.out.println("本局胜利，双倍积分"+score);
                gameUser.setIntegral(gameUser.getIntegral()+2*score);
            }else{
                System.out.println("本局胜利，积分"+score);
                gameUser.setIntegral(gameUser.getIntegral()+score);
            }
        }
        checkLevel();
        System.out.println("玩家当前级别："+gameUser.getGameUserLevel().levalName+",当前积分"+gameUser.getIntegral());
    }

    public abstract void changeCards();
    public abstract void peekCards();
}
