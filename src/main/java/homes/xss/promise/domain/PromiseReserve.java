package homes.xss.promise.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class PromiseReserve {

    @TableId
    private Integer id = 0;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate reserveDate;
    private String customerName;
    private String reserveItems;
    private String remark;

}
