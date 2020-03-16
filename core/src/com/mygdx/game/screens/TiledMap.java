package com.mygdx.game.screens;


import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;



public class TiledMap implements Screen {
    private com.badlogic.gdx.maps.tiled.TiledMap tiledMap;
    private OrthographicCamera camera;
    private OrthogonalTiledMapRenderer mapRenderer;

    public TiledMap(){
        camera = new OrthographicCamera();
        camera.setToOrtho(false);
        camera.update();

        tiledMap = new TmxMapLoader().load("gameMap.tmx");
        mapRenderer = new OrthogonalTiledMapRenderer(tiledMap);
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
        tiledMap.dispose();

    }

}
