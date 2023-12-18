package homes.xss.promise.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import homes.xss.promise.domain.PromiseReserve;
import homes.xss.promise.vo.PromiseReserveQueryVO;

public interface PromiseReserveService extends IService<PromiseReserve> {
    IPage<PromiseReserve> pageList(PromiseReserveQueryVO vo);
}
