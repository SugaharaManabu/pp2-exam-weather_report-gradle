
package com.example.report;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Description {

    @SerializedName("publicTime")
    @Expose
    private String publicTime;
    @SerializedName("publicTimeFormatted")
    @Expose
    private String publicTimeFormatted;
    @SerializedName("headlineText")
    @Expose
    private String headlineText;
    @SerializedName("bodyText")
    @Expose
    private String bodyText;
    @SerializedName("text")
    @Expose
    private String text;

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

    public String getHeadlineText() {
        return headlineText;
    }

    public void setHeadlineText(String headlineText) {
        this.headlineText = headlineText;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
