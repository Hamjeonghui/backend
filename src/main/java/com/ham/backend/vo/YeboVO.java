package com.ham.backend.vo;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class YeboVO {

    // 멤버변수
    private String rk;
    private String yeboDate;
    private String schedule;
    private String insDate;
    private String yebo1;
    private String yebo2;
    private String weather1;
    private String wether2; //컬럼명 변경
    private String status1;
    private String status2;
    private String temp1;
    private String temp2;
    private String prcp1;
    private String prcp2;
    private String etcpr1;
    private String etcpr2;
    private String exist;

    // 게터세터
    public String getRk() {
        return rk;
    }

    public void setRk(String rk) {
        this.rk = rk;
    }

    public String getYeboDate() {
        return yeboDate;
    }

    public void setYeboDate(String yeboDate) {
        this.yeboDate = yeboDate;
    }

    public String getInsDate() {
        return insDate;
    }

    public void setInsDate(String insDate) {
        this.insDate = insDate;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getYebo1() {
        return yebo1;
    }

    public void setYebo1(String yebo1) {
        this.yebo1 = yebo1;
    }

    public String getYebo2() {
        return yebo2;
    }

    public void setYebo2(String yebo2) {
        this.yebo2 = yebo2;
    }

    public String getWeather1() {
        return weather1;
    }

    public void setWeather1(String weather1) {
        this.weather1 = weather1;
    }

    public String getWether2() {
        return wether2;
    }

    public void setWether2(String wether2) {
        this.wether2 = wether2;
    }

    public String getStatus1() {
        return status1;
    }

    public void setStatus1(String status1) {
        this.status1 = status1;
    }

    public String getStatus2() {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2;
    }

    public String getTemp1() {
        return temp1;
    }

    public void setTemp1(String temp1) {
        this.temp1 = temp1;
    }

    public String getTemp2() {
        return temp2;
    }

    public void setTemp2(String temp2) {
        this.temp2 = temp2;
    }

    public String getPrcp1() {
        return prcp1;
    }

    public void setPrcp1(String prcp1) {
        this.prcp1 = prcp1;
    }

    public String getPrcp2() {
        return prcp2;
    }

    public void setPrcp2(String prcp2) {
        this.prcp2 = prcp2;
    }

    public String getEtcpr1() {
        return etcpr1;
    }

    public void setEtcpr1(String etcpr1) {
        this.etcpr1 = etcpr1;
    }

    public String getEtcpr2() {
        return etcpr2;
    }

    public void setEtcpr2(String etcpr2) {
        this.etcpr2 = etcpr2;
    }

    public String getExist() {
        return exist;
    }

    public void setExist(String exist) {
        this.exist = exist;
    }

    //투스트링
    @Override
    public String toString() {
        return "{" +
                "rk:'" + rk + '\'' +
                ", yeboDate:" + yeboDate +
                ", schedule:'" + schedule + '\'' +
                ", insDate:" + insDate +
                ", yebo1:'" + yebo1 + '\'' +
                ", yebo2:'" + yebo2 + '\'' +
                ", weather1:'" + weather1 + '\'' +
                ", wether2:'" + wether2 + '\'' +
                ", status1:'" + status1 + '\'' +
                ", status2:'" + status2 + '\'' +
                ", temp1:'" + temp1 + '\'' +
                ", temp2:'" + temp2 + '\'' +
                ", prcp1:'" + prcp1 + '\'' +
                ", prcp2:'" + prcp2 + '\'' +
                ", etcpr1:'" + etcpr1 + '\'' +
                ", etcpr2:'" + etcpr2 + '\'' +
                ", exist:'" + exist + '\'' +
                '}';
    }
}
