/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chua_bai_qllh.repository;

import chua_bai_qllh.model.BoMon;
import chua_bai_qllh.model.LopHoc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author nguyenvv
 */
public class LopHocRepository {

    private DBConnection connection;

    public ArrayList<LopHoc> getLopHocFromDB() {
        ArrayList<LopHoc> listLopHoc = new ArrayList<>();
        String sql = "SELECT lophoc.ma_lop_hoc, lophoc.ten_lop, bomon.ten_bo_mon, lophoc.si_so\n"
                + " FROM lophoc JOIN bomon \n"
                + " on lophoc.ma_bo_mon = bomon.ma_bo_mon";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LopHoc lopHoc = new LopHoc();
                lopHoc.setMaLopHoc(rs.getInt(1));
                lopHoc.setTenLopHoc(rs.getString(2));

                BoMon boMon = new BoMon();
                boMon.setTenBoMon(rs.getString(3));
                lopHoc.setBoMon(boMon);
                lopHoc.setSiSo(rs.getInt(4));

                listLopHoc.add(lopHoc);
            }
        } catch (Exception e) {
            e.getMessage();
        }

        return listLopHoc;
    }

    public ArrayList<String> getListMaboMon() {
        ArrayList<String> list = new ArrayList<>();

        String sql = "SELECT bomon.ma_bo_mon FROM bomon ";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String str = rs.getString(1);
                list.add(str);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return list;

    }

    public Boolean addNew(LopHoc lopHoc) {
        String query = "insert into lophoc(ten_lop, ma_bo_mon, si_so) VALUES (?,?,?);";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, lopHoc.getTenLopHoc());
            ps.setObject(2, lopHoc.getBoMon().getMaBoMon());
            ps.setObject(3, lopHoc.getSiSo());
            ps.executeUpdate();
            return true;
        } catch (Exception ex) {
            ex.getMessage();
            return false;
        }
    }

}
