package com.springbootmybatis.controller;

import com.springbootmybatis.VO.StudentVO;
import com.springbootmybatis.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    public IStudentService iStudentService;

    @RequestMapping(value = "/index")
    @ResponseBody
    public StudentVO getStudentVO(){
        StudentVO studentVO = new StudentVO();
        studentVO.setName("shidi");
        return iStudentService.getStudentVO(studentVO);
    }
}
