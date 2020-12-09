package org.springframework.samples.petclinic.sfgtest;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * created by kw on 12/8/2020 @ 6:51 PM
 */
@Component
public class LaurelWordProducer implements WordProducer{
    @Override
    public String getWord() {
        return "Laurel";
    }
}
