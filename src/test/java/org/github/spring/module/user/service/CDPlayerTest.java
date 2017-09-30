package org.github.spring.module.user.service;

import org.github.spring.test.CDPlayerConfig;
import org.github.spring.test.CompactDisc;
import org.github.spring.test.MediaPlayer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Resource(name = "lonelyHeartsClub")
    private CompactDisc cd;

    @Resource
    private MediaPlayer player;

    @Test
    public void cdShouldNotBeNull() {
        Assert.assertNotNull(cd);
    }

    public void play() {
        player.play();
    }
}
