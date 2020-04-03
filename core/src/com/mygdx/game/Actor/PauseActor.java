package com.mygdx.game.Actor;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.mygdx.game.MainGame;
import com.mygdx.game.screens.PauseScreen;

public class PauseActor extends Actor {
    public Sprite sprite;
    private MainGame game;
    public PauseActor(Texture texture, final String actorName, MainGame mainGame){
        this.game = mainGame;
        int width = Gdx.graphics.getWidth();
        int height = Gdx.graphics.getHeight();
        sprite = new Sprite(texture);
        setTouchable(Touchable.enabled);
        if(actorName.equals("menu")) {
            sprite.setSize(width/4f,height/3f);
            sprite.setPosition(width-width/14f-sprite.getWidth()/2,height/9f-sprite.getHeight()/2);
            addListener(new InputListener() {
                @Override
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                    return true;
                }
            });
        }else if(actorName.equals("exit")) {
            sprite.setSize(width/4f,height/3f);
            sprite.setPosition(width-width/14f-sprite.getWidth()/2,height/9f-sprite.getHeight()/2);
            addListener(new InputListener() {
                @Override
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                    return true;
                }
            });
        }else if(actorName.equals("continue")) {
            sprite.setSize(width/4f,height/3f);
            sprite.setPosition(width-width/14f-sprite.getWidth()/2,height/9f-sprite.getHeight()/2);
            addListener(new InputListener() {
                @Override
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                    return true;
                }
            });
        }
    }
}
