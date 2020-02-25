package behavior.State.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/25 18:43
 */
public class Primary extends GameUserLevel {
    public Primary(GameUser gameUser) {
        this.levalName = "入门级";
        this.doubleScore = false;
        this.gameUser = gameUser;
    }

    public Primary(GameUserLevel gameUserLevel) {
        this.levalName = "入门级";
        this.doubleScore = false;
        this.gameUser = gameUserLevel.gameUser;
    }

    @Override
    public void checkLevel() {
        if(gameUser.getIntegral()>100){
            gameUser.setGameUserLevel(new Final(this));
        }else if(gameUser.getIntegral()>80){
            gameUser.setGameUserLevel(new Professional(this));
        }else if(gameUser.getIntegral()>60){
            gameUser.setGameUserLevel(new Secondary(this));
        }
    }

    @Override
    public void changeCards() {

    }

    @Override
    public void peekCards() {

    }
}
