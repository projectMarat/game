package com.mygdx.game.blocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public class ButtonEnd {
    Texture endButtonTexture;
    Sprite endButtonSprite;
    float width,height;
    public Vector3 temp = new Vector3();
    public ButtonEnd(){
        width = Gdx.graphics.getWidth();
        height = Gdx.graphics.getHeight();
        endButtonTexture = new Texture(Gdx.files.internal("end.png"));
        endButtonSprite = new Sprite(endButtonTexture);
        endButtonSprite.setSize(width/3f,height/5);
        endButtonSprite.setPosition(width/2- endButtonSprite.getWidth()/2,height/2- endButtonSprite.getHeight()/2-height/7);

    }
    public static float getX() {
        return Gdx.graphics.getWidth()/2-Gdx.graphics.getWidth()/3f/2;
    }

    public static float getWidth() {
        return Gdx.graphics.getWidth()/3f;
    }

    public static float getY() {
        return Gdx.graphics.getHeight()/2-Gdx.graphics.getHeight()/2/5-Gdx.graphics.getHeight()/7;
    }

    public static float getHeight() {
        return Gdx.graphics.getHeight()/5;
    }
    public void ren(SpriteBatch batch){
        endButtonSprite.draw(batch);
    }
    public void dis(){ endButtonTexture.dispose();}

}
