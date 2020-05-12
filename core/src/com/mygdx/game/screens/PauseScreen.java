package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.mygdx.game.MainGame;

public class PauseScreen implements Screen {
    public MainGame mainGame;
    public TileMap tileMap;
    private PauseScreenStage pauseScreenStage;
    public PauseScreen(MainGame mainGame,TileMap tileMap){
        this.mainGame = mainGame;
        this.tileMap = tileMap;
        pauseScreenStage = new PauseScreenStage(mainGame,tileMap);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        pauseScreenStage.render(delta);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        pauseScreenStage.dispose();
    }
}
