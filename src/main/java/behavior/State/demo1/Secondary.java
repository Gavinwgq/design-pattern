package behavior.State.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/25 18:43
 */
public class Secondary extends GameUserLevel {

    public Secondary(GameUserLevel gameUserLevel) {
        this.levalName = "熟练级";
        this.doubleScore = true;
        this.gameUser = gameUserLevel.gameUser;
    }

    @Override
    public void checkLevel() {
        if(gameUser.getIntegral()>100){
            gameUser.setGameUserLevel(new Final(this));
        }else if(gameUser.getIntegral()>80){
            gameUser.setGameUserLevel(new Professional(this));
        }else if(gameUser.getIntegral()<=60){
            gameUser.setGameUserLevel(new Primary(this));
        }
    }

    @Override
    public void changeCards() {

    }

    @Override
    public void peekCards() {

    }
}
