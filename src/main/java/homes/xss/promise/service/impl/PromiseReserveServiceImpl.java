package homes.xss.promise.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import homes.xss.promise.dao.PromiseReserveMapper;
import homes.xss.promise.domain.PromiseReserve;
import homes.xss.promise.service.PromiseReserveService;
import homes.xss.promise.vo.PromiseReserveQueryVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PromiseReserveServiceImpl extends ServiceImpl<PromiseReserveMapper, PromiseReserve>
        implements PromiseReserveService {
    @Override
    public IPage<PromiseReserve> pageList(PromiseReserveQueryVO vo) {
        return null;
    }
}
