
package com.example.report;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Forecast {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("dateLabel")
    @Expose
    private String dateLabel;
    @SerializedName("telop")
    @Expose
    private String telop;
    @SerializedName("detail")
    @Expose
    private Detail detail;
    @SerializedName("temperature")
    @Expose
    private Temperature temperature;
    @SerializedName("chanceOfRain")
    @Expose
    private ChanceOfRain chanceOfRain;
    @SerializedName("image")
    @Expose
    private Image image;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateLabel() {
        return dateLabel;
    }

    public void setDateLabel(String dateLabel) {
        this.dateLabel = dateLabel;
    }

    public String getTelop() {
        return telop;
    }

    public void setTelop(String telop) {
        this.telop = telop;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public ChanceOfRain getChanceOfRain() {
        return chanceOfRain;
    }

    public void setChanceOfRain(ChanceOfRain chanceOfRain) {
        this.chanceOfRain = chanceOfRain;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

}
