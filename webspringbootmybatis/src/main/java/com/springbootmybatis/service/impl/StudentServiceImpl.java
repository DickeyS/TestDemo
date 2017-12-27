package com.springbootmybatis.service.impl;

import com.springbootmybatis.VO.StudentVO;
import com.springbootmybatis.mapper.StudentMapper;
import com.springbootmybatis.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    public StudentMapper studentMapper;


    public StudentVO getStudentVO(StudentVO studentVO) {
        return studentMapper.getStudentVO(studentVO);
    }
}
