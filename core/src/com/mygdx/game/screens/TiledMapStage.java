package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.game.Actor.MapActor;

public class TiledMapStage {

    public TileMap tileMap;
    private Stage stage;
    public OrthographicCamera camera;

    TiledMapStage(OrthographicCamera Camera, TileMap tileMap){
        this.tileMap = tileMap;
        this.camera = Camera;
        ScreenViewport viewport = new ScreenViewport();
        stage = new Stage(viewport);
        Gdx.input.setInputProcessor(stage);
        MapActor zoomIn = new MapActor(new Texture("zoomIn.png"),"zoomIn", camera, this);
        MapActor zoomOut = new MapActor(new Texture("zoomOut.png"),"zoomOut",camera,this);
        MapActor pauseButton = new MapActor(new Texture("pause.png"),"pauseButton",camera,this);
        stage.addActor(zoomIn);
        stage.addActor(zoomOut);
        stage.addActor(pauseButton);

    }
    public void render(){
        stage.draw();
    }
    public void dispose(){
        stage.dispose();
    }
}
