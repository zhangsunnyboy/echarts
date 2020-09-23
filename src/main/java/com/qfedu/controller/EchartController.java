package com.qfedu.controller;

import com.qfedu.entity.NewStudent;
import com.qfedu.entity.ScoreResult;
import com.qfedu.service.NewStudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * projectName: echarts
 * author: 张宁
 * time: 2020/9/23 21:10
 * description:
 */
@Controller
public class EchartController {
    @Autowired
    private NewStudentInfoService newStudentInfoService;
    @RequestMapping("/hello.do")
    @ResponseBody
    public List<NewStudent> getStudent(){
        List<NewStudent> allStudent = newStudentInfoService.getAllStudent();
        return allStudent;
    }
    @RequestMapping("/getData.do")
    @ResponseBody
    public List<ScoreResult>  getData () {
        List<NewStudent> allStudent = newStudentInfoService.getAllStudent();
        List<ScoreResult> results = new ArrayList<ScoreResult>();
        for (NewStudent newStudent: allStudent) {
            //只要学生的名字和成绩封装到一个result
            ScoreResult scoreResult = new ScoreResult(newStudent.getScore(), newStudent.getName());
            results.add(scoreResult);
        }
        return results;
    }
}
