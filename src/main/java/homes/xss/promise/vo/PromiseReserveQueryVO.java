package homes.xss.promise.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class PromiseReserveQueryVO {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate reserveDate;
    private String customerName;
    private String reserveItems;
    private String remark;
    private Integer pageSize = 10;
    private Integer pageNum = 1;

}
