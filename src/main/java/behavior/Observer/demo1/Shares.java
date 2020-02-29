package behavior.Observer.demo1;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 股票 观察目标
 * @author wangguoqiang
 * @date 2020/2/29 16:14
 */
public  class Shares {
    /**
     * 股票名称
     */
    private String name;
    /**
     * 涨幅
     */
    private double range;

    public Shares(String name) {
        this.name = name;
    }

    private List<Shareholder> list = Lists.newArrayList();

    public void addShareholer(Shareholder shareholder){
        list.add(shareholder);
    }

    public void removeShareholer(Shareholder shareholder){
        list.remove(shareholder);
    }

    public void notifyRange(){
        if(isNotify()){
            System.out.println("股票"+this.name+"大涨"+(this.range*100)+"%");
            for (Shareholder shareholder : list) {
                shareholder.handleShare();
            }
        }else{
            System.out.println("股票涨幅不大，不通知了");
        }
    }

    public boolean isNotify(){
        return this.range>0.05;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }
}
