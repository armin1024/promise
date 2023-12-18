package homes.xss.promise.controller;

import homes.xss.promise.common.ResultBody;
import homes.xss.promise.service.LoginService;
import homes.xss.promise.vo.LoginVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Resource
    private LoginService loginService;

    @PostMapping
    public ResultBody<Object> login(@RequestBody LoginVO vo) {
//        loginService.login(vo);
        return ResultBody.ok();
    }

}
