package com.mygdx.game.blocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ButtonStart {
    Texture startButtonTexture;
    Sprite startButtonSprite;
    float width,height;
    public ButtonStart(){
        width = Gdx.graphics.getWidth();
        height = Gdx.graphics.getHeight();
        startButtonTexture = new Texture(Gdx.files.internal("Start.png"));
        startButtonSprite = new Sprite(startButtonTexture);
        startButtonSprite.setSize(width/3f,height/5);
        startButtonSprite.setPosition(width/2-startButtonSprite.getWidth()/2,height/2-startButtonSprite.getHeight()/2+height/7);

    }

    public static float getX() { return Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/3f/2; }
    public static float getWidth() {
        return Gdx.graphics.getWidth()/3f;
    }
    public static float getY() { return Gdx.graphics.getHeight()/2-Gdx.graphics.getHeight()/2/5+Gdx.graphics.getHeight()/7; }
    public static float getHeight() {
        return Gdx.graphics.getHeight()/5;
    }
    public void ren(SpriteBatch batch){
        startButtonSprite.draw(batch);
    }
    public void dis(){ startButtonTexture.dispose(); }
}
