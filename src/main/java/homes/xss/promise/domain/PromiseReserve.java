package homes.xss.promise.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PromiseReserve {

    @TableId
    private Integer id = 0;
    private LocalDate reserveDate;
    private String customerName;
    private String reserveItems;
    private String remark;

}
