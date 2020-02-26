package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public class TiledMap implements Screen {
    com.badlogic.gdx.maps.tiled.TiledMap map;
    OrthographicCamera camera;
    OrthogonalTiledMapRenderer mapRenderer;

    public TiledMap(){
        camera = new OrthographicCamera();
        camera.setToOrtho(false);
        camera.update();

        map = new TmxMapLoader().load("test2.tmx");
        mapRenderer = new OrthogonalTiledMapRenderer(map);

    }
    @Override
    public void render (float delta) {
        mapRenderer.setView(camera);
        mapRenderer.render();
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
    public void show() {

    }

    @Override
    public void hide() {
        dispose();
    }

    @Override
    public void dispose() {
        mapRenderer.dispose();
        map.dispose();

    }

}
