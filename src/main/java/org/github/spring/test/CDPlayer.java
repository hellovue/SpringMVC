package org.github.spring.test;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class CDPlayer implements MediaPlayer {
    @Resource(name = "lonelyHeartsClub")
    private CompactDisc cd;

    @Override
    public void play() {
        cd.play();
    }
}
