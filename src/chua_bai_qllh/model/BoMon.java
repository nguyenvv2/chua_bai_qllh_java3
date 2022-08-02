/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chua_bai_qllh.model;

/**
 *
 * @author nguyenvv
 */
public class BoMon {

    private String maBoMon;

    private String tenBoMon;

    public BoMon(String maBoMon, String tenBoMon) {
        this.maBoMon = maBoMon;
        this.tenBoMon = tenBoMon;
    }

    public BoMon() {
    }

    public String getMaBoMon() {
        return maBoMon;
    }

    public void setMaBoMon(String maBoMon) {
        this.maBoMon = maBoMon;
    }

    public String getTenBoMon() {
        return tenBoMon;
    }

    public void setTenBoMon(String tenBoMon) {
        this.tenBoMon = tenBoMon;
    }

}
