package com.mygdx.game.Actor;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.mygdx.game.screens.MainMenuStage;
import com.mygdx.game.screens.TileMap;
import com.mygdx.game.screens.TiledMapStage;


public class MyActor extends Actor {

    Sprite sprite;
    MainMenuStage mainMenuStage;

    public MyActor(Texture texture, final String actorName, final MainMenuStage mainMenuStage) {
        this.mainMenuStage = mainMenuStage;
        int width = Gdx.graphics.getWidth();
        int height = Gdx.graphics.getHeight();
        sprite = new Sprite(texture);
        setTouchable(Touchable.enabled);
        if(actorName.equals("startButton")){
            sprite.setSize(width/3f,height/5);
            sprite.setPosition(width/2-sprite.getWidth()/2,height/2-sprite.getHeight()/2+height/7);
            addListener(new InputListener() {
                @Override
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                    TileMap tileMap = new TileMap(mainMenuStage.game);
                    mainMenuStage.game.setScreen(tileMap);
                    return true;
                }
            });
        }else if(actorName.equals("exitButton")){
            sprite.setSize(width/3f,height/5);
            sprite.setPosition(width/2- sprite.getWidth()/2,height/2- sprite.getHeight()/2-height/7);
            addListener(new InputListener() {
                @Override
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                    Gdx.app.exit();
                    return true;
                }
            });
        } else{
            addListener(new InputListener() {
                @Override
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
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