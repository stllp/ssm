package com.lvlp.stu.other.exception;

/**
 * @Author : 吕良平
 * @Date: 2024-09-06 9:24
 * @Description:
 */

import com.lvlp.stu.other.util.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //切片类增强
public class ControllerExceptionHandler {
    @ExceptionHandler(NullPointerException.class)
    public R nullPointerExceptionHandler(NullPointerException exception) {
        return R.fail(null,exception.getMessage());
    }
    @ExceptionHandler(ArithmeticException.class)
    public R arithmeticExceptionHandler(ArithmeticException exception) {
        return R.fail(null,exception.getMessage());
    }
    @ExceptionHandler(NumberFormatException.class)
    public R numberFormatExceptionHandler(NumberFormatException exception) {
        return R.fail(null,exception.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public R exceptionHandler(Exception exception) {
        return R.fail(null,exception.getMessage());
    }
}
