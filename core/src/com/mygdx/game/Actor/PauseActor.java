package com.mygdx.game.Actor;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.game.MainGame;
import com.mygdx.game.screens.PauseScreen;

public class PauseActor extends Actor {
    public Sprite sprite;
    private MainGame game;
    public PauseActor(MainGame mainGame){
        this.game = mainGame;

    }
}
