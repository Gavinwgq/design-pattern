package behavior.State.demo1;

/**
 * @author wangguoqiang
 * @date 2020/2/25 18:59
 */
public class Client {

    public static void main(String[] args) {
        GameUser gameUser = new GameUser("范闲");
        gameUser.play(20,1);
        gameUser.play(30,1);
        gameUser.changeCards();
        gameUser.peekCards();
        System.out.println("----------------");
        gameUser.play(20,1);
        gameUser.changeCards();
        gameUser.peekCards();
        System.out.println("----------------");
        gameUser.play(5,1);
        gameUser.changeCards();
        gameUser.peekCards();
        System.out.println("----------------");
        gameUser.play(5,1);
        gameUser.changeCards();
        gameUser.peekCards();
        System.out.println("----------------");
        gameUser.play(15,1);
        gameUser.changeCards();
        gameUser.peekCards();
        System.out.println("----------------");
        gameUser.play(25,0);
        gameUser.changeCards();
        gameUser.peekCards();
        System.out.println("----------------");
        gameUser.play(20,0);
        gameUser.changeCards();
        gameUser.peekCards();
        System.out.println("----------------");
        gameUser.play(30,0);
        gameUser.changeCards();
        gameUser.peekCards();
    }
}
