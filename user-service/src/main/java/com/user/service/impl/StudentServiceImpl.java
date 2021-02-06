package com.user.service.impl;

import com.user.repository.StudentRepository;
import com.user.repository.entity.Student;
import com.user.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @Author: tushuai
 * @Description:
 * @Date Created in 2021-01-18 22:10
 * @Modified By:
 */
@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(String number) {
        Optional<Student> student = studentRepository.findByNumberAndDeleteFlagIsFalse(number);
        if (!student.isPresent()) {
            log.error("student is not exists, number is -> {}", number);
        }
        return student.orElse(null);
    }


}
