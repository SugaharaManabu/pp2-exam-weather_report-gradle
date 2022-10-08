
package com.example.report;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class ChanceOfRain {

    @SerializedName("T00_06")
    @Expose
    private String t0006;
    @SerializedName("T06_12")
    @Expose
    private String t0612;
    @SerializedName("T12_18")
    @Expose
    private String t1218;
    @SerializedName("T18_24")
    @Expose
    private String t1824;

    public String getT0006() {
        return t0006;
    }

    public void setT0006(String t0006) {
        this.t0006 = t0006;
    }

    public String getT0612() {
        return t0612;
    }

    public void setT0612(String t0612) {
        this.t0612 = t0612;
    }

    public String getT1218() {
        return t1218;
    }

    public void setT1218(String t1218) {
        this.t1218 = t1218;
    }

    public String getT1824() {
        return t1824;
    }

    public void setT1824(String t1824) {
        this.t1824 = t1824;
    }

}
