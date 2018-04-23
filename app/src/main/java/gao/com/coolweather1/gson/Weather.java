package gao.com.coolweather1.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by gao on 2018/4/23.
 */

public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastsList;
}
