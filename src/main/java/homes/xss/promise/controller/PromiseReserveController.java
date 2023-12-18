package homes.xss.promise.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import homes.xss.promise.common.ResultBody;
import homes.xss.promise.domain.PromiseReserve;
import homes.xss.promise.service.PromiseReserveService;
import homes.xss.promise.vo.PromiseReserveQueryVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/reserve")
public class PromiseReserveController {
    @Resource
    private PromiseReserveService promiseReserveService;

    @GetMapping
    public ResultBody<IPage<PromiseReserve>> page(PromiseReserveQueryVO vo) {
        IPage<PromiseReserve> page = promiseReserveService.pageList(vo);
        return ResultBody.ok(page);
    }

    @PostMapping
    public ResultBody<Object> save(@RequestBody PromiseReserve vo) {
        promiseReserveService.save(vo);
        return ResultBody.ok();
    }

    @PutMapping
    public ResultBody<Object> update(@RequestBody PromiseReserve vo) {
        promiseReserveService.updateById(vo);
        return ResultBody.ok();
    }

    @DeleteMapping
    public ResultBody<Object> delete(@RequestBody PromiseReserve vo) {
        promiseReserveService.removeById(vo.getId());
        return ResultBody.ok();
    }

}
