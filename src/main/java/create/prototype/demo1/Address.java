package create.prototype.demo1;

import java.io.Serializable;

/**
 * @author wangguoqiang
 * @date 2020/2/9 16:34
 */
public class Address implements Serializable {
    private String province;
    private String city;
    private String county;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}
