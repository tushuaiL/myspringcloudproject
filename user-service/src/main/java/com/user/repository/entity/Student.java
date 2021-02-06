package com.user.repository.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @Author: tushuai
 * @Description:
 * @Date Created in 2021-01-18 21:52
 * @Modified By:
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "id")
    @GenericGenerator(name = "idGen", strategy = "uuid")
    @GeneratedValue(generator = "idGen")
    private String id;

    @Column(name = "number")
    private String number;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "sex")
    private Integer sex;

    @Column(name = "graduation_date")
    private String graduationDate;

    @Column(name = "delete_flag")
//    private Integer deleteFlag;
    private Boolean deleteFlag;

    @Column(name = "create_time")
    private String createTime;

}
