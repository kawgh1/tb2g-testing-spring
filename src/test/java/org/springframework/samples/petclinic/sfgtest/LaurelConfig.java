package org.springframework.samples.petclinic.sfgtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.samples.petclinic.sfgtest.LaurelWordProducer;

/**
 * created by kw on 12/8/2020 @ 6:58 PM
 */
@Configuration
@Profile("base-test")
public class LaurelConfig {

    @Bean
    LaurelWordProducer laurelWordProducer() {
        return new LaurelWordProducer();
    }
}
