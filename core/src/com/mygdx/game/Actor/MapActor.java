package com.mygdx.game.Actor;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ai.GdxAI;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.mygdx.game.MainGame;
import com.mygdx.game.screens.PauseScreen;
import com.mygdx.game.screens.TileMap;
import com.mygdx.game.screens.TiledMapStage;

public class MapActor extends Actor {
    public OrthographicCamera camera;
    public Sprite sprite;
    public TiledMapStage tiledMapStage;
    public TileMap tileMap;
    public MainGame mainGame;

    public MapActor(Texture texture, final String actorName, final OrthographicCamera camera, final TiledMapStage tiledMapStage, final MainGame mainGame, final TileMap tileMap){
        this.camera = camera;
        this.tiledMapStage = tiledMapStage;
        this.mainGame = mainGame;
        this.tileMap = tileMap;
        int width = Gdx.graphics.getWidth();
        int height = Gdx.graphics.getHeight();
        sprite = new Sprite(texture);
        setTouchable(Touchable.enabled);
        if(actorName.equals("zoomIn")) {
            sprite.setSize(width/14f,height/9f);
            sprite.setPosition(width-width/14f-sprite.getWidth()/2,height/9f-sprite.getHeight()/2);
            addListener(new InputListener() {
                @Override
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                    camera.zoom  -= 0.1;
                    if(camera.zoom<0.2)camera.zoom = (float) 0.2;
                    return true;
                }
            });
        }else if(actorName.equals("zoomOut")){
            sprite.setSize(width/14f,height/9f);
            sprite.setPosition(width/14f-sprite.getWidth()/2,height/9f-sprite.getHeight()/2);
            addListener(new InputListener() {
                @Override
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                    camera.zoom  += 0.1;
                    if(camera.zoom>2)camera.zoom=2;
                    return true;
                }
            });
        }else if(actorName.equals("pauseButton")){
            sprite.setSize(width/14f,height/9f);
            sprite.setPosition(width/16f-sprite.getWidth()/2,height-sprite.getHeight());
            addListener(new InputListener() {
                @Override
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                    tiledMapStage.tileMap.mainGame.setScreen(new PauseScreen(mainGame,tileMap));
                    return true;
                }
            });
        }else if(actorName.equals("object")){
            final float width1 = texture.getWidth()*2;
            final float height1 = texture.getHeight()*2;
            sprite.setSize(width1,height1);
            sprite.setPosition(500f,500f);
            addListener(new InputListener(){
                @Override
                public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                    sprite.setSize(width1/camera.zoom,height1/camera.zoom);
                    return true;
                }
            });
        }
        spritePos(sprite.getX(), sprite.getY());
        setBounds(sprite.getX(),sprite.getY(),sprite.getWidth(),sprite.getHeight());
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
    public void spritePos(float x, float y){
        sprite.setPosition(x, y);
        setBounds(sprite.getX(), sprite.getY(), sprite.getWidth(), sprite.getHeight());
    }
}
