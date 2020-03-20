package com.mygdx.game.screens;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.MainGame;


public class TileMap implements Screen, GestureDetector.GestureListener {
    private TiledMap tiledMap;
    public OrthographicCamera camera;
    private OrthogonalTiledMapRenderer mapRenderer;
    private TiledMapStage tiledMapStage;
    public MainGame game;
    public TileMap(MainGame mainGame){
        this.game = mainGame;
        camera = new OrthographicCamera();
        camera.setToOrtho(false);
        camera.translate(Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2);
        camera.update();
        tiledMapStage = new TiledMapStage(camera,this);
        tiledMap = new TmxMapLoader().load("gameMap.tmx");
        mapRenderer = new OrthogonalTiledMapRenderer(tiledMap);


    }
    @Override
    public void render (float delta) {
        float x = Gdx.input.getDeltaX();
        float y = Gdx.input.getDeltaY();
        Gdx.gl.glClearColor(135/255f, 206/255f, 235/255f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.position.add(-x, y, 0);
        camera.update();
        mapRenderer.render();
        mapRenderer.setView(camera);
        tiledMapStage.render();
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

    }

    @Override
    public void dispose() {
        mapRenderer.dispose();
        tiledMap.dispose();
        tiledMapStage.dispose();
    }

    @Override
    public boolean touchDown(float x, float y, int pointer, int button) {
        return false;
    }

    @Override
    public boolean tap(float x, float y, int count, int button) {
        return false;
    }

    @Override
    public boolean longPress(float x, float y) {
        return false;
    }

    @Override
    public boolean fling(float velocityX, float velocityY, int button) {
        return false;
    }

    @Override
    public boolean pan(float x, float y, float deltaX, float deltaY) {
        return false;
    }

    @Override
    public boolean panStop(float x, float y, int pointer, int button) {
        return false;
    }

    @Override
    public boolean zoom(float initialDistance, float distance) {
        return false;
    }

    @Override
    public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2, Vector2 pointer1, Vector2 pointer2) {
        return false;
    }

    @Override
    public void pinchStop() {

    }
}
