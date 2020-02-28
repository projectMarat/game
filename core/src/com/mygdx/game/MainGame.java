package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.screens.ActorMenu;

public class MainGame extends Game {

    @Override
    public void create() {
        setScreen(new ActorMenu(this));
    }
}