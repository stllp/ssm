package com.lvlp.stu.other.controll;

import com.lvlp.stu.other.util.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : 吕良平
 * @Date: 2024-09-06 9:13
 * @Description:
 */
@RestController // @Controller + @ResponseBody
@RequestMapping("/target")
public class TargetController {

    @GetMapping("/a")
    public R a() {
        System.out.println("----");
        System.out.println("----");
        System.out.println("----");
        int i = 10 / 0;
        return R.ok(null);
    }
    @GetMapping("/b")
    public R b() {
        System.out.println("----");
        System.out.println("----");
        System.out.println("----");
        int i = Integer.valueOf("aaac");
        return R.ok(null);
    }
    @GetMapping("/c")
    public R c() {
        System.out.println("----");
        System.out.println("----");
        System.out.println("----");
        String[] aa=null;
        System.out.println(aa);
        return R.ok(null);
    }

}
