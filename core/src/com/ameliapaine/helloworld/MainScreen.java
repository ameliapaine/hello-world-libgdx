package com.ameliapaine.helloworld;

import com.badlogic.gdx.Screen;

/**
 * Created by Amelia on 6/22/2015.
 */
public class MainScreen implements Screen {
    private World world;
    private WorldController worldController;
    private WorldRenderer worldRenderer;

    @Override
    public void show() {
        world = new World();
        worldController = new WorldController(world);
        worldRenderer = new WorldRenderer(world);
    }

    @Override
    public void render(float delta) {
        worldController.processInput();
        world.update(delta);
        worldRenderer.render();
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
