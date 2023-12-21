package homes.xss.promise.config;

import homes.xss.promise.common.ResultBody;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler<T> {

    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public ResultBody<T> exceptionHandler(Exception e){
        log.error(e.getMessage(), e);
        return ResultBody.failed(e.getMessage());
    }
}
