package gao.com.coolweather1.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gao on 2018/4/23.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;


    public class Temperature {
        public String max;

        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
