package homes.xss.promise.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import homes.xss.promise.dao.PromiseReserveMapper;
import homes.xss.promise.domain.PromiseReserve;
import homes.xss.promise.service.PromiseReserveService;
import homes.xss.promise.vo.PromiseReserveQueryVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDate;

@Service
@Slf4j
public class PromiseReserveServiceImpl extends ServiceImpl<PromiseReserveMapper, PromiseReserve>
        implements PromiseReserveService {
    @Override
    public IPage<PromiseReserve> pageList(PromiseReserveQueryVO vo) {
        return this.page(
                new Page<>(vo.getPageNum(), vo.getPageSize()),
                getCondition(vo)
        );
    }

    private LambdaQueryWrapper<PromiseReserve> getCondition(PromiseReserveQueryVO vo) {
        LambdaQueryWrapper<PromiseReserve> queryWrapper = new LambdaQueryWrapper<>();
        LocalDate reserveDate = vo.getReserveDate();
        String reserveItems = vo.getReserveItems();
        String customerName = vo.getCustomerName();
        String remark = vo.getRemark();
        if (reserveDate != null) {
            queryWrapper.like(PromiseReserve::getReserveDate, reserveDate);
        }
        if (!StringUtils.isEmpty(reserveItems)) {
            queryWrapper.like(PromiseReserve::getReserveItems, reserveItems);
        }
        if (!StringUtils.isEmpty(customerName)) {
            queryWrapper.like(PromiseReserve::getCustomerName, customerName);
        }
        if (!StringUtils.isEmpty(remark)) {
            queryWrapper.like(PromiseReserve::getRemark, remark);
        }
        return queryWrapper;
    }
}
