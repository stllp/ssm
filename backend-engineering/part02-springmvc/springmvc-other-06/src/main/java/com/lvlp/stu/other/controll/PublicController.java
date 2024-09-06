package com.lvlp.stu.other.controll;

import com.lvlp.stu.other.util.R;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : 吕良平
 * @Date: 2024-09-06 15:00
 * @Description:
 */
@RestController
@RequestMapping("/public")
public class PublicController {
    @GetMapping("/login")
    public R login(HttpSession session) {
        session.setAttribute("username","111");
        System.out.println("PublicController 类的 login方法执行了");
        return R.ok(null);
    }
    @GetMapping("/one")
    public R one() {
        System.out.println("PublicController 类的 one方法执行了");
        return R.ok(null);
    }
    @GetMapping("/two")
    public R two() {
        System.out.println("PublicController 类的 two方法执行了");
        return R.ok(null);
    }
    @GetMapping("/three")
    public R three() {
        System.out.println("PublicController 类的 three方法执行了");
        return R.ok(null);
    }
}
