package com.mygdx.game;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
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
import com.mygdx.game.screens.Menu;
import com.mygdx.game.screens.TiledMap;


public class MainGame extends Game {
    Application app;
    @Override
    public void create() {
        //main();

    }
    public void main(){
        switch (values.screen){
            case 0: setScreen(new Menu());
                break;
            case 1:
                setScreen(new TiledMap());
                break;
        }
    }
}
