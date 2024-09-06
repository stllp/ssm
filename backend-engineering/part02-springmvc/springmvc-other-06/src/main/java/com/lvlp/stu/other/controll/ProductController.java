package com.lvlp.stu.other.controll;

import com.lvlp.stu.other.pojo.Product;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : 吕良平
 * @Date: 2024-09-06 15:36
 * @Description:
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @PostMapping("/json")
    public String reception(@RequestBody @Validated Product product) {

        System.out.println("product = " + product);
        return "ok";
    }
}
