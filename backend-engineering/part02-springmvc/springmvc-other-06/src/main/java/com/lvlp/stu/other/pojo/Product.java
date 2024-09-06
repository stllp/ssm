package com.lvlp.stu.other.pojo;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author : 吕良平
 * @Date: 2024-09-06 15:26
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Null(message = "必须为null")
    private String id;
    @NotNull(message = "请赋值不能为null")
    private String name;
    @DecimalMin("3.14")
    @DecimalMax("99.99")
    private double price;
    @Max(100)
    @Min(10)
    private int amount;
    @AssertFalse
    private boolean is_true;
    //    @AssertTrue
    private boolean is_false;
    @Length(min = 5, max = 10)
    private String password;
    @Range(min = 5, max = 10)
    private int s1;
    @NotEmpty //不能为空不能为null   可以为空格
    private String s2;
    @NotBlank //  能为空不能为null 不能为空格
    private String s3;
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")
    private String email;
    @Past
    @DateTimeFormat(style = "yyyy-MM-dd")
    private Date date1;
    @Future
    @DateTimeFormat(style = "yyyy-MM-dd")
    private Date date2;
}
