package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.game.Actor.MyActor;
import com.mygdx.game.Actor.PauseActor;
import com.mygdx.game.MainGame;

public class PauseScreenStage {

    public MainGame mainGame;
    public TileMap tileMap;
    private Stage stage;
    PauseScreenStage(MainGame mainGame, TileMap tileMap){
        this.mainGame = mainGame;
        this.tileMap = tileMap;
        ScreenViewport viewport = new ScreenViewport();
        stage = new Stage(viewport);
        Gdx.input.setInputProcessor(stage);
        PauseActor exitButton = new PauseActor(new Texture("end.png"),"exit", mainGame, tileMap);
        PauseActor continueButton = new PauseActor(new Texture("Start.png"),"continue", mainGame, tileMap);

        stage.addActor(continueButton);
    }
    public void render(float delta){
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.draw();
    }
    public void dispose(){
        stage.dispose();
    }
}
