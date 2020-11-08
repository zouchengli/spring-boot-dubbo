package site.clzblog.demo.dubbo.consumer;

import com.hyron.demo.dubbo.api.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DefaultDemoService implements ApplicationRunner {
    @DubboReference
    private DemoService demoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            log.info("{}", demoService.sayHello("Dubbo"));
        }
    }
}
