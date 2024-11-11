package tostu.dddplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.modulith.Modulithic;

@Modulithic(
        sharedModules = {"tostu.dddplayground.core"}
)
@SpringBootApplication
public class DddPlaygroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(DddPlaygroundApplication.class, args);
    }

}
