package org.github.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDPlayerConfig {
    @Bean(name = "sgtPeppers")
    public CompactDisc generateSgtPeppers() {
        return new SgtPeppers();
    }
}
