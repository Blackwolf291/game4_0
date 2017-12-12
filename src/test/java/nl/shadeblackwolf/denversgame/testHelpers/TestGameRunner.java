package nl.shadeblackwolf.denversgame.testHelpers;

import nl.shadeblackwolf.denversgame.Game;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestGameRunner {
    private Throwable t;

    public void runGame() {
        try {
            Game.main();
        } catch (Throwable gameCrasher) {
            t = gameCrasher;
        }
    }

    public void verifyNoExceptions() {
        assertThat(t, is(nullValue()));
    }
}
