package nl.shadeblackwolf.denversgame.ui;

import nl.shadeblackwolf.denversgame.ui.screens.TitleScreen;

public class UI {
    private static UI instance = new UI();
    private Screen currentScreen = new TitleScreen();
    public static UI getInstance(){return instance;}
    private UI(){}

    public boolean running() {
        return true;
    }

    public Screen getCurrentScreen() {
        return currentScreen;
    }
}
