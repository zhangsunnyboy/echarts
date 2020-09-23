package com.qfedu.service.impl;

import com.qfedu.dao.NewStudentInfoDao;
import com.qfedu.entity.NewStudent;
import com.qfedu.service.NewStudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: echarts
 * author: 张宁
 * time: 2020/9/23 21:05
 * description:
 */
@Service
public class NewStudentInfoServiceImpl implements NewStudentInfoService {
    @Autowired
    private NewStudentInfoDao newStudentInfoDao;
    @Override
    public List<NewStudent> getAllStudent() {
        return newStudentInfoDao.getAllStudent();
    }
}
