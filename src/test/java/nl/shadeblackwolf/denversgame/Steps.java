package nl.shadeblackwolf.denversgame;

import cucumber.api.PendingException;
import cucumber.api.java8.En;
import cucumber.runtime.java.StepDefAnnotation;
import nl.shadeblackwolf.denversgame.player.Player;
import nl.shadeblackwolf.denversgame.testHelpers.TestFileManager;
import nl.shadeblackwolf.denversgame.testHelpers.TestGameRunner;
import nl.shadeblackwolf.denversgame.ui.screens.TitleScreen;
import nl.shadeblackwolf.denversgame.ui.UI;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@StepDefAnnotation
public class Steps implements En {
    public Steps() {
        TestGameRunner testGameRunner = new TestGameRunner();
        TestFileManager testFileManager = new TestFileManager();

        After(testFileManager::purgeTemporaryFiles);

        Given("^a clean installation$", () -> {});
        Given("^there is a save game$", () -> testFileManager.createFile("save1.json"));
        Given("^there are stored settings", () -> testFileManager.createFile("settings.json"));

        Given("^the player is in-game$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });


        When("^the game is started$", testGameRunner::runGame);

        Then("^no error occurs$", testGameRunner::verifyNoExceptions);
        Then("^the UI is running$", () -> assertThat(UI.getInstance().running(), is(true)));
        Then("^the titlescreen is displayed$", () -> assertThat(UI.getInstance().getCurrentScreen(), instanceOf(TitleScreen.class)));

        createFacingSteps();

        createMovementSteps();

        createButtonSteps();
    }

    private void createMovementSteps() {
        Then("^the player turns right$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("^the player turns left$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
    }

    private void createFacingSteps() {
        Given("^the player is facing left$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Given("^the player is facing right$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
    }

    private void createButtonSteps() {
        When("^the move right button is pressed$", () -> {
            throw new PendingException();
        });
        When("^the move left button is pressed$", () -> {
            throw new PendingException();
        });
    }
}
