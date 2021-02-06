package com.user.service;

import com.user.repository.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

/**
 * @Author: tushuai
 * @Description:
 * @Date Created in 2021-01-18 22:11
 * @Modified By:
 */
public interface StudentService {

    /**
     * @param
     * @Description
     * @Return java.util.List<com.user.repository.entity.Student>
     */
    List<Student> findAll();

    Student getStudent(String number);
}
