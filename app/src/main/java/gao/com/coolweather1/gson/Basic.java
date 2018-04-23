package gao.com.coolweather1.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gao on 2018/4/23.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }


}
