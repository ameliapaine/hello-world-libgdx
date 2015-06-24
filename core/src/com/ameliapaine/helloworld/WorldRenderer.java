package com.ameliapaine.helloworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Amelia on 6/22/2015.
 */
public class WorldRenderer {
    private World world;
    private SpriteBatch batch;
    private Texture img;

    public WorldRenderer(World world) {
        this.world = world;
        batch = new SpriteBatch();
        img =  new Texture("happy-red-panda.jpg");
    }

    public void render() {
        Gdx.gl.glClearColor(1, 0.6f, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, 0, 0);
        batch.end();
    }
}
