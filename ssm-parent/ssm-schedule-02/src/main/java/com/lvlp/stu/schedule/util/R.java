package com.lvlp.stu.schedule.util;

import lombok.Data;

/**
 * @Author lvlp
 * @create 2024/9/5 23:29
 */
@Data
public class R {
    private int code = 200;
    private boolean flag = true;
    private String message;
    private Object data;

    public static R ok(Object data) {
        R r = new R();
        r.data = data;
        return r;
    }

    public static R fail(Object data, String message) {
        R r = new R();
        r.code = 500;
        r.flag = false;
        r.data = data;
        r.message = message;
        return r;
    }
}
