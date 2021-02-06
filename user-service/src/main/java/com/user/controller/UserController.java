package com.user.controller;

import com.user.controller.vo.StudentVo;
import com.user.repository.entity.Student;
import com.user.service.StudentService;
import feign.Param;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang.StringUtils;
import org.mockito.internal.util.StringUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: tushuai
 * @Description:
 * @Date Created in 2021-01-18 22:10
 * @Modified By:
 */
@RestController
@RequestMapping(value = "/user")
@Api(tags = "UserController", value = "user-service测试接口")
public class UserController {

    @Resource
    private StudentService studentService;

    @GetMapping("/all")
    @ApiOperation(value = "查找所有学生信息")
    public List<Student> findAllStudent() {
        List<Student> studentList = studentService.findAll();
        if (null != studentList & studentList.size() > 0) {
            return studentList;
        }
        return null;
    }

    @PostMapping("/byNumber")
    @ApiOperation(value = "根据学号查找学生信息")
    public String findStudentByNumber(@ApiParam(value = "StudentVo") @RequestBody StudentVo studentVo) {
        Student student = null;
        if (null != studentVo) {
            student = studentService.getStudent(studentVo.getNumber());
        }
        return student.toString();
    }

    // feign测试
    @GetMapping("/byNumber1/{number}")
//    @RequestMapping(value = "/byNumber1/{number}", method = RequestMethod.GET)
    public String getStudent(@PathVariable("number")  String number) {
        Student student = null;
        if (StringUtils.isNotBlank(number)) {
            student = studentService.getStudent(number);
        }
        return student == null ? null : student.toString();
    }
}
