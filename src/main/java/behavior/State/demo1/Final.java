package behavior.State.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/25 18:43
 */
public class Final extends GameUserLevel {

    public Final(GameUserLevel gameUserLevel) {
        this.levalName = "骨灰级";
        this.doubleScore = true;
        this.gameUser = gameUserLevel.gameUser;
    }

    @Override
    public void checkLevel() {
        if(gameUser.getIntegral()<=60){
            gameUser.setGameUserLevel(new Primary(this));
        }else if(gameUser.getIntegral()<=80){
            gameUser.setGameUserLevel(new Secondary(this));
        }else if(gameUser.getIntegral()<=100){
            gameUser.setGameUserLevel(new Professional(this));
        }
    }

    @Override
    public void changeCards() {
        System.out.println("玩家当前级别："+levalName+"可以换牌");
    }

    @Override
    public void peekCards() {
        System.out.println("玩家当前级别："+levalName+"可以看别人牌");
    }
}
