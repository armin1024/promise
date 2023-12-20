package homes.xss.promise.config;

import homes.xss.promise.common.ResultBody;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler<T> {

    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public ResultBody<T> exceptionHandler(Exception e){
        return ResultBody.failed(e.getMessage());
    }
}
