package org.github.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {
    @Bean
    public Knight knight(Quest quest) {
        return new BraveKnight(quest);
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
