package com.gdx.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gdx.game.screens.GameScreen;
import com.gdx.game.screens.MenuScreen;


public class HuntersGame extends Game {
	public SpriteBatch batch;

	@Override
	public void create () {
		//this.create();

		batch = new SpriteBatch();
		this.setScreen(new MenuScreen((this)));

	}

	@Override
	public void render () {
		super.render();
		//this.render();

	}
	
	/*@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}*/
}
