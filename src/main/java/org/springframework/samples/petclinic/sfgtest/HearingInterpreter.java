package org.springframework.samples.petclinic.sfgtest;

import org.springframework.stereotype.Service;

/**
 * created by kw on 12/8/2020 @ 6:52 PM
 */
@Service
public class HearingInterpreter {

    private final WordProducer wordProducer;

    public HearingInterpreter(WordProducer wordProducer) {
        this.wordProducer = wordProducer;
    }

    public String whatIheard() {
        String word = wordProducer.getWord();

        System.out.println(word);

        return word;
    }
}
