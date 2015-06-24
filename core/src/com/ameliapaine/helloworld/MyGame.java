package com.ameliapaine.helloworld;

import com.badlogic.gdx.Game;

/**
 * Created by Amelia on 6/22/2015.
 */
public class MyGame extends Game {
    @Override
    public void create() {
        setScreen(new MainScreen());
    }
}
