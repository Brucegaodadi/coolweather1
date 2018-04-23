package gao.com.coolweather1.gson;

/**
 * Created by gao on 2018/4/23.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
