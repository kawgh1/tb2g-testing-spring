package org.springframework.samples.petclinic.sfgtest.junit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.sfgtest.BaseConfig;
import org.springframework.samples.petclinic.sfgtest.HearingInterpreter;
import org.springframework.samples.petclinic.sfgtest.YannyConfig;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * created by kw on 12/8/2020 @ 7:15 PM
 */
// JUnit 4 test with pure Spring (Not Spring Boot)
@ActiveProfiles("base-test")
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {BaseConfig.class, YannyConfig.class})
public class HearingInterpreterYannyTest {

    @Autowired
    HearingInterpreter hearingInterpreter;

    // managed by Spring Context
//    @Before
//    public void setUp() throws Exception {
//        hearingInterpreter = new HearingInterpreter(new LaurelWordProducer());
//    }

    @Test
    public void whatIheard() {
        String word = hearingInterpreter.whatIheard();

        assertEquals("Yanny", word);
    }
}