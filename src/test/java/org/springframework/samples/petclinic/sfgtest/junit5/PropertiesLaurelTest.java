package org.springframework.samples.petclinic.sfgtest.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.samples.petclinic.sfgtest.HearingInterpreter;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * created by kw on 12/8/2020 @ 8:20 PM
 */
@TestPropertySource("classpath:laurel.properties")
@ActiveProfiles("laurel-properties")
@SpringJUnitConfig(classes = PropertiesLaurelTest.TestConfig.class)
public class PropertiesLaurelTest {

    @Configuration
    @ComponentScan("org.springframework.samples.petclinic.sfgtest")
    static class TestConfig {

    }

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIheard() {
        String word = hearingInterpreter.whatIheard();

        assertEquals("LAUrel", word);
    }
}
