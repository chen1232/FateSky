package com.fatesky;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Fatesky Web程序启动类
 *
 * @author chengd
 * @date 2019-01-5 9:43
 */
public class FateskyApplicationInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(FateskyApplication.class);
    }
}
