package com.lvlp.stu.other.controll;

import com.lvlp.stu.other.util.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : 吕良平
 * @Date: 2024-09-06 15:03
 * @Description:
 */
@RestController
@RequestMapping("/private")
public class PrivateController {
    @GetMapping("/one")
    public R one() {
        System.out.println("PrivateController 类的 one方法执行了");
        return R.ok(null);
    }
    @GetMapping("/two")
    public R two() {
        System.out.println("PrivateController 类的 two方法执行了");
        return R.ok(null);
    }
    @GetMapping("/three")
    public R three() {
        System.out.println("PrivateController 类的 three方法执行了");
        return R.ok(null);
    }
}
