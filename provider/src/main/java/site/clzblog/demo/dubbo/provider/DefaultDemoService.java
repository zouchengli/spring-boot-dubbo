package site.clzblog.demo.dubbo.provider;

import com.hyron.demo.dubbo.api.DemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

@DubboService
public class DefaultDemoService implements DemoService {

    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${dubbo.protocol.port}")
    private String servicePort;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", servicePort, name);
    }
}
