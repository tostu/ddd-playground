package tostu.dddplayground;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;


class DddPlaygroundApplicationTests {

    @Test
    void modules() {
        ApplicationModules.of(DddPlaygroundApplication.class).forEach(System.out::println);
    }

    @Test
    void verify() {
        ApplicationModules.of(DddPlaygroundApplication.class).verify();
    }

    @Test
    void documentation() {

        var modules = ApplicationModules.of(DddPlaygroundApplication.class).verify();

        new Documenter(modules)
                .writeModulesAsPlantUml();
    }

}
