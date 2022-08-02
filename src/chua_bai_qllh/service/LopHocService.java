/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package chua_bai_qllh.service;

import chua_bai_qllh.model.LopHoc;
import java.util.ArrayList;

/**
 *
 * @author nguyenvv
 */
public interface LopHocService {

    public ArrayList<LopHoc> getListLopHoc();

    public ArrayList<String> getListMaBoMon();

    public Boolean addNew(LopHoc lopHoc);

}
