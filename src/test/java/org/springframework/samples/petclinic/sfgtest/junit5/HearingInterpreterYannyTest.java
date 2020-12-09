package org.springframework.samples.petclinic.sfgtest.junit5;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.sfgtest.BaseConfig;
import org.springframework.samples.petclinic.sfgtest.HearingInterpreter;
import org.springframework.samples.petclinic.sfgtest.YannyConfig;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * created by kw on 12/8/2020 @ 7:22 PM
 */
// Junit 5 with Spring
@ActiveProfiles("base-test")
@SpringJUnitConfig(classes = {BaseConfig.class, YannyConfig.class})
class HearingInterpreterYannyTest {

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIheard() {
        String word = hearingInterpreter.whatIheard();

        assertEquals("Yanny", word);
    }
}