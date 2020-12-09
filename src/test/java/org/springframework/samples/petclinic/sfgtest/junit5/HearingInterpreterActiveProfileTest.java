package org.springframework.samples.petclinic.sfgtest.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.samples.petclinic.sfgtest.HearingInterpreter;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * created by kw on 12/8/2020 @ 8:00 PM
 */
@ActiveProfiles("yanny")
@SpringJUnitConfig(classes = HearingInterpreterActiveProfileTest.TestConfig.class)
public class HearingInterpreterActiveProfileTest {

    @Configuration
    @ComponentScan("org.springframework.samples.petclinic.sfgtest")
    static class TestConfig {

    }

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIheard() {
        String word = hearingInterpreter.whatIheard();

        Assertions.assertEquals("Yanny", word);
    }
}
