package com.gdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.gdx.game.HuntersGame;

public class MenuScreen implements Screen {

    HuntersGame game;
    Texture background,playBefore,playAfter,exitBefore,exitAfter,storeBefore,storeAfter,infoAfter,infoBefore;

    public MenuScreen(HuntersGame game){
        this.game = game;
        //play button as image
        playBefore = new Texture("Startbefore.png");
        playAfter = new Texture("Startafter.png");
        //exit button as image
        exitBefore = new Texture("EXITbefore.png");
        exitAfter = new Texture("EXITafter.png");
        //store button as image
        storeBefore = new Texture("STOREbefore.png");
        storeAfter = new Texture("STOREafter.png");
        //info button as image
        infoAfter = new Texture("INFOafter.png");
        infoBefore = new Texture("INFObefore.png");

        background = new Texture("background.png");
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //positions of play button
        int xp=Gdx.graphics.getWidth()/2 - playBefore.getWidth()/2;
        int yp= playAfter.getHeight()+100;
        //positions of info button
        int xi=Gdx.graphics.getWidth()/2 - infoBefore.getWidth()/2;
        int yi= infoAfter.getHeight()+300;
        //positions of store button
        int xs=Gdx.graphics.getWidth()/2 - storeBefore.getWidth()/2;
        int ys= storeAfter.getHeight()+200;
        //positions of exit button
        int xe=Gdx.graphics.getWidth()/2 - exitBefore.getWidth()/2;
        int ye= exitAfter.getHeight()+400;
        //positions of the mouse
        int x=Gdx.input.getX(),y=Gdx.input.getY();
        //start batch
        game.batch.begin();
        game.batch.draw(background,0,0,1000,700);
        //game.batch.draw(playBefore,Gdx.graphics.getWidth()/2 -playBefore.getWidth()/2,450);

        if(x>xp && x<xp+playBefore.getWidth() && y>yp && y<yp+playBefore.getHeight()){
            game.batch.draw(playAfter,Gdx.graphics.getWidth()/2 -playBefore.getWidth()/2,450);
            if(Gdx.input.isTouched()){
                this.dispose();
                game.setScreen(new GameScreen(game));
                System.out.println("start has been touched");
            }
        }else{
            game.batch.draw(playBefore,Gdx.graphics.getWidth()/2 -playBefore.getWidth()/2,450);
        }
        if(x>xs && x<xs+storeBefore.getWidth() && y>ys && y<ys+storeBefore.getHeight()){
            game.batch.draw(storeAfter,Gdx.graphics.getWidth()/2 -storeBefore.getWidth()/2,350);
            if(Gdx.input.isTouched()){
                //this.dispose();
                //game.setScreen(new GameScreen(game));
                System.out.println("store has been touched");
            }
        }else{
            game.batch.draw(storeBefore,Gdx.graphics.getWidth()/2 -storeBefore.getWidth()/2,350);
        }
        if(x>xi && x<xi+infoBefore.getWidth() && y>yi && y<yi+infoBefore.getHeight()){
            game.batch.draw(infoAfter,Gdx.graphics.getWidth()/2 -infoBefore.getWidth()/2,250);
            if(Gdx.input.isTouched()){
                //this.dispose();
                //game.setScreen(new GameScreen(game));
                System.out.println("info has been touched");
            }
        }else{
            game.batch.draw(infoBefore,Gdx.graphics.getWidth()/2 -infoBefore.getWidth()/2,250);
        }
        if(x>xe && x<xe+exitBefore.getWidth() && y>ye && y<ye+exitBefore.getHeight()){
            game.batch.draw(exitAfter,Gdx.graphics.getWidth()/2 -exitBefore.getWidth()/2,150);
            if(Gdx.input.isTouched()){
                this.dispose();
                //game.setScreen(new GameScreen(game));
                System.out.println("exit has been touched");
            }
        }else{
            game.batch.draw(exitBefore,Gdx.graphics.getWidth()/2 -exitBefore.getWidth()/2,150);
        }

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
