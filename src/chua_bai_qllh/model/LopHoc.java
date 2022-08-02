/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chua_bai_qllh.model;

/**
 *
 * @author nguyenvv
 */
public class LopHoc {

    private int maLopHoc;

    private String tenLopHoc;

    private BoMon boMon;

    private int siSo;

    public LopHoc() {
    }

    public LopHoc(int maLopHoc, String tenLopHoc, BoMon boMon, int siSo) {
        this.maLopHoc = maLopHoc;
        this.tenLopHoc = tenLopHoc;
        this.boMon = boMon;
        this.siSo = siSo;
    }

    public int getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(int maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public String getTenLopHoc() {
        return tenLopHoc;
    }

    public void setTenLopHoc(String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
    }

    public BoMon getBoMon() {
        return boMon;
    }

    public void setBoMon(BoMon boMon) {
        this.boMon = boMon;
    }

    public int getSiSo() {
        return siSo;
    }

    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }

}
