package org.springframework.samples.petclinic.sfgtest.junit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.sfgtest.BaseConfig;
import org.springframework.samples.petclinic.sfgtest.HearingInterpreter;
import org.springframework.samples.petclinic.sfgtest.LaurelConfig;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;



/**
 * created by kw on 12/8/2020 @ 7:00 PM
 */
// JUnit 4 test with pure Spring (Not Spring Boot)
@ActiveProfiles("base-test")
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {BaseConfig.class, LaurelConfig.class})
public class HearingInterpreterLaurelTest {

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

        assertEquals("Laurel", word);
    }
}