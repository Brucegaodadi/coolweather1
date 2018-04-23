package gao.com.coolweather1.db;

import org.litepal.crud.DataSupport;

/**
 * Created by gao on 2018/4/22.
 */

public class City extends DataSupport {
    private int id;

    private String cityName;

    private int cityCode;

    private int provinceid;

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceid() {
        return provinceid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceid(int provinceid) {
        this.provinceid = provinceid;
    }
}
