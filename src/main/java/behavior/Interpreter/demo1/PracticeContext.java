package behavior.Interpreter.demo1;

import java.util.StringTokenizer;

/**
 * 环境类
 * @author wangguoqiang
 * @date 2020/3/1 16:15
 */
public class PracticeContext {
    private String text;
    private StringTokenizer tokenizer;
    private String currentToken;

    public PracticeContext(String text) {
        this.text = text;
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    public String nextToken(){
        if(tokenizer.hasMoreTokens()){
            currentToken = tokenizer.nextToken();
        }else{
            currentToken = null;
        }
        return currentToken;
    }

    public String currectToken(){
        return currentToken;
    }

    public void skipToken(String token){
        if(!token.equalsIgnoreCase(currentToken)){
            System.err.println(String.format("错误提示：%s解释错误！", currentToken));
        }
        nextToken();
    }

    public String getText() {
        return text;
    }
}
