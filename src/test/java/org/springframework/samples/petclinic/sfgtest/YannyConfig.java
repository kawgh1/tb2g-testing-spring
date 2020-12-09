package org.springframework.samples.petclinic.sfgtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.samples.petclinic.sfgtest.YannyWordProducer;

/**
 * created by kw on 12/8/2020 @ 7:12 PM
 */
@Configuration
@Profile("base-test")
public class YannyConfig {

    @Bean
    YannyWordProducer yannyWordProducer() {
        return new YannyWordProducer();
    }
}