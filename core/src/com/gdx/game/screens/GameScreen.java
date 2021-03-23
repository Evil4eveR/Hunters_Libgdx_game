package com.gdx.game.screens;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.gdx.game.HuntersGame;

public class GameScreen implements Screen {

    Texture background,img;
    float x,y;
    HuntersGame game;

    public GameScreen (HuntersGame game){
        this.game = game;
    }

    @Override
    public void show() {
        background = new Texture("land.png");
        img = new Texture("shopMove.png");
    }

    @Override
    public void render(float delta) {
        if(Gdx.input.isKeyPressed(Input.Keys.UP)){
            System.out.println("W is pressed");
            y+=4;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            y-=4;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            x+=4;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            x-=4;
        }
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        System.out.println(""+ Gdx.graphics.getDeltaTime());// delta time is a float with a decimal


        game.batch.begin();
        game.batch.draw(background, 0, 0,1000,700);
        game.batch.draw(img, x, y);
        game.batch.end();
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

    }

    @Override
    public void dispose() {

    }
}
