package gao.com.coolweather1.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gao on 2018/4/23.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}

