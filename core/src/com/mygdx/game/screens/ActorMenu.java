package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.game.Actor.MyActor;
import com.mygdx.game.MainGame;

public class ActorMenu implements Screen {

    private Stage stage;
    public MainGame game;

    public ActorMenu(MainGame game) {
        this.game = game;
        ScreenViewport viewport = new ScreenViewport();
        stage = new Stage(viewport);
        Gdx.input.setInputProcessor(stage);
        MyActor startButton = new MyActor(new Texture("Start.png"),"startButton",this);
        MyActor exitButton = new MyActor(new Texture("end.png"),"exitButton",this);
        MyActor background = new MyActor(new Texture("sunset.png"),"background",this);
        stage.addActor(background);
        stage.addActor(startButton);
        stage.addActor(exitButton);


    }
    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(delta);
        stage.draw();
    }


    @Override
    public void show() {

    }

    @Override
    public void resize(int width, int height) {
        stage.getViewport().update(width, height, true);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {
        dispose();
    }

    public void dispose() {

        stage.dispose();
    }
}