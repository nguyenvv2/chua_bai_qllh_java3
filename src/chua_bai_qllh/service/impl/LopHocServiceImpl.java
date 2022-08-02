/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chua_bai_qllh.service.impl;

import chua_bai_qllh.model.LopHoc;
import chua_bai_qllh.repository.LopHocRepository;
import chua_bai_qllh.service.LopHocService;
import java.util.ArrayList;

/**
 *
 * @author nguyenvv
 */
public class LopHocServiceImpl implements LopHocService {

    private LopHocRepository lopHocRepository = new LopHocRepository();

    @Override
    public ArrayList<LopHoc> getListLopHoc() {
        return lopHocRepository.getLopHocFromDB();
    }

    @Override
    public ArrayList<String> getListMaBoMon() {
        return lopHocRepository.getListMaboMon();
    }

    @Override
    public Boolean addNew(LopHoc lopHoc) {
        return lopHocRepository.addNew(lopHoc);
    }

}
