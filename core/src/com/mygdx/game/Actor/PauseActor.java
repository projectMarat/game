package com.mygdx.game.Actor;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.mygdx.game.MainGame;
import com.mygdx.game.screens.TileMap;

public class PauseActor extends Actor {
    public Sprite sprite;
    private MainGame mainGame;
    private TileMap tileMap;
    public PauseActor(Texture texture, final String actorName, final MainGame maingame, final TileMap tiledMap){
        this.mainGame = maingame;
        this.tileMap = tiledMap;
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
//            sprite.setSize(width/4f,height/3f);
//            sprite.setPosition(width-width/14f-sprite.getWidth()/2,height/9f-sprite.getHeight()/2);
            addListener(new InputListener() {
                @Override
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                    return true;
                }
            });
        }else if(actorName.equals("continue")) {
//            sprite.setSize(width/4f,height/3f);
//            sprite.setPosition(width-width/14f-sprite.getWidth()/2,height/9f-sprite.getHeight()/2);
            sprite.setSize(width/3f,height/5);
            sprite.setPosition(width/2-sprite.getWidth()/2,height/2-sprite.getHeight()/2+height/7);
            addListener(new InputListener() {
                @Override
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                    mainGame.setScreen(tileMap);
                    tileMap.Refresh();
                    return true;
                }
            });
        }
        spritePos(sprite.getX(), sprite.getY());
        setBounds(sprite.getX(),sprite.getY(),sprite.getWidth(),sprite.getHeight());
    }
    public void spritePos(float x, float y){
        sprite.setPosition(x, y);
        setBounds(sprite.getX(), sprite.getY(), sprite.getWidth(), sprite.getHeight());
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.setColor(1, 1, 1, parentAlpha);
        sprite.draw(batch);
    }
}
