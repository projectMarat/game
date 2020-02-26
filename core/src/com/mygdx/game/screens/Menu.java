package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.mygdx.game.blocks.ButtonEnd;
import com.mygdx.game.blocks.ButtonStart;
import com.mygdx.game.values;

public class Menu implements Screen {
    Vector3 temp = new Vector3();
    ButtonEnd buttonEnd;
    ButtonStart buttonStart;
    Texture backGroundTexture;
    Sprite backGroundSprite;
    SpriteBatch batch;
    OrthographicCamera camera;
    public void handleTouch() {
        if (Gdx.input.justTouched()) {
            temp.set(Gdx.input.getX(), Gdx.input.getY(), 0);
            camera.unproject(temp);
            float touchX = temp.x;
            float touchY = temp.y;
            if ((touchX >= ButtonStart.getX()) && touchX <= (ButtonStart.getX() + ButtonStart.getWidth()) && (touchY >= ButtonStart.getY()) && touchY <= (ButtonStart.getY() + ButtonStart.getHeight())) {

            }else if((touchX>= ButtonEnd.getX()) && touchX<= (ButtonEnd.getX()+ButtonEnd.getWidth()) && (touchY>=ButtonEnd.getY()) && touchY<=(ButtonEnd.getY()+ButtonEnd.getHeight())){
                Gdx.app.exit();
            }
        }
    }
    public Menu(){
        float height= Gdx.graphics.getHeight();
        float width = Gdx.graphics.getWidth();
        camera = new OrthographicCamera(width,height);
        camera.setToOrtho(false);
        batch = new SpriteBatch();
        backGroundTexture = new Texture(Gdx.files.internal("sunset.png"));
        backGroundSprite = new Sprite(backGroundTexture);
        backGroundSprite.setSize(width,height);
        buttonStart = new ButtonStart();
        buttonEnd = new ButtonEnd();
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        backGroundSprite.draw(batch);
        buttonStart.ren(batch);
        buttonEnd.ren(batch);
        handleTouch();
        batch.end();
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
        dispose();
    }

    @Override
    public void dispose() {
        batch.dispose();
        buttonStart.dis();
        buttonEnd.dis();
    }
}

