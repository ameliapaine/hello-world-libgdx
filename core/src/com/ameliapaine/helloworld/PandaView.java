package com.ameliapaine.helloworld;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Amelia on 6/16/2015.
 */
public class PandaView {
    private Texture img;

    public PandaView() {
        setUpImg();
    }

    private void setUpImg() {
        img = new Texture("happy-red-panda.jpg");
    }

    public void render(SpriteBatch batch, PandaModel panda) {
        batch.draw(img, panda.getX(), panda.getY());
    }
}
