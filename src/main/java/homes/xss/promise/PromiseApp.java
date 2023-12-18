package homes.xss.promise;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("homes.xss.promise.dao")
@SpringBootApplication
public class PromiseApp {

    public static void main(String[] args) {
        SpringApplication.run(PromiseApp.class, args);
    }

}
