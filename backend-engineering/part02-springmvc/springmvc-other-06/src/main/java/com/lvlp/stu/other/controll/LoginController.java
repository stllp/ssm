package com.lvlp.stu.other.controll;

import com.lvlp.stu.other.util.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : 吕良平
 * @Date: 2024-09-06 9:52
 * @Description:
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @GetMapping("/admin")
    public R admin() {
        System.out.println("目标登录方法");
        return R.ok(null);
    }

    @GetMapping("/exit")
    public R exit() {
        System.out.println("目标退出方法");
        return R.ok(null);
    }

    @GetMapping("/register/reg")
    public R register() {
        System.out.println("目标注册方法");
        return R.ok(null);
    }

}
