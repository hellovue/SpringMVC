package org.github.spring.module.user.service;

import org.github.spring.test.BraveKnight;
import org.github.spring.test.Quest;
import org.junit.Test;
import org.mockito.Mockito;

public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = Mockito.mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();
        Mockito.verify(mockQuest, Mockito.times(1)).embark();
    }
}
