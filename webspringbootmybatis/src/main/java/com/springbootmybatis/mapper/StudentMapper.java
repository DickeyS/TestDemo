package com.springbootmybatis.mapper;


import com.springbootmybatis.VO.StudentVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface StudentMapper {

    StudentVO getStudentVO(StudentVO studentVO);

    int addStudentVO(StudentVO studentVO);
}
