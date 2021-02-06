package com.user.repository;

import com.user.repository.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Optional;

/**
 * @Author: tushuai
 * @Description:
 * @Date Created in 2021-01-18 21:51
 * @Modified By:
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable> {

    Optional<Student> findByNumberAndDeleteFlagIsFalse(String number);

}
