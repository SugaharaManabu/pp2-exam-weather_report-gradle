
package com.example.report;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Report {

    @SerializedName("publicTime")
    @Expose
    private String publicTime;
    @SerializedName("publicTimeFormatted")
    @Expose
    private String publicTimeFormatted;
    @SerializedName("publishingOffice")
    @Expose
    private String publishingOffice;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("forecasts")
    @Expose
    private List<Forecast> forecasts = null;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("copyright")
    @Expose
    private Copyright copyright;

    public String getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(String publicTime) {
        this.publicTime = publicTime;
    }

    public String getPublicTimeFormatted() {
        return publicTimeFormatted;
    }

    public void setPublicTimeFormatted(String publicTimeFormatted) {
        this.publicTimeFormatted = publicTimeFormatted;
    }

    public String getPublishingOffice() {
        return publishingOffice;
    }

    public void setPublishingOffice(String publishingOffice) {
        this.publishingOffice = publishingOffice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public List<Forecast> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Copyright getCopyright() {
        return copyright;
    }

    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

}
