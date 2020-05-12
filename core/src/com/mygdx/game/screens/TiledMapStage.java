package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.game.Actor.MapActor;
import com.mygdx.game.MainGame;

public class TiledMapStage {

    public TileMap tileMap;
    private Stage stage;
    public OrthographicCamera camera;
    public MainGame mainGame;
    TiledMapStage(OrthographicCamera Camera, TileMap tileMap, MainGame mainGame){
        this.tileMap = tileMap;
        this.camera = Camera;
        this.mainGame = mainGame;
        ScreenViewport viewport = new ScreenViewport();
        stage = new Stage(viewport);
        Gdx.input.setInputProcessor(stage);
        MapActor zoomIn = new MapActor(new Texture("zoomIn.png"),"zoomIn", camera, this,mainGame,tileMap);
        MapActor zoomOut = new MapActor(new Texture("zoomOut.png"),"zoomOut",camera,this,mainGame,tileMap);
        MapActor pauseButton = new MapActor(new Texture("pause.png"),"pauseButton",camera,this,mainGame,tileMap);
        MapActor object = new MapActor(new Texture("obvodka.png"),"object",camera,this,mainGame,tileMap);
        stage.addActor(zoomIn);
        stage.addActor(zoomOut);
        stage.addActor(pauseButton);
        //stage.addActor(object);

    }
    public void render(){
        stage.draw();
    }
    public void dispose(){
        stage.dispose();
    }
}
