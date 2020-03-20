package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.screens.MainMenuStage;

public class MainGame extends Game {

    @Override
    public void create() {
        setScreen(new MainMenuStage(this));
    }
}